/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.commons.querygen.Queryable;
import com.epam.ta.reportportal.dao.util.QueryUtils;
import com.epam.ta.reportportal.entity.item.ItemAttributePojo;
import com.epam.ta.reportportal.jooq.tables.records.JItemAttributeRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static com.epam.ta.reportportal.dao.constant.WidgetContentRepositoryConstants.*;
import static com.epam.ta.reportportal.dao.util.JooqFieldNameTransformer.fieldName;
import static com.epam.ta.reportportal.jooq.Tables.*;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
@Repository
public class ItemAttributeRepositoryCustomImpl implements ItemAttributeRepositoryCustom {

	public static final Integer ATTRIBUTES_LIMIT = 50;

	private final DSLContext dslContext;

	@Autowired
	public ItemAttributeRepositoryCustomImpl(DSLContext dslContext) {
		this.dslContext = dslContext;
	}

	@Override
	public List<String> findAllKeysByLaunchFilter(Queryable launchFilter, Pageable launchPageable, boolean isLatest, String keyPart,
			boolean isSystem) {

		return dslContext.select(fieldName(KEY))
				.from(dslContext.with(LAUNCHES)
						.as(QueryUtils.createQueryBuilderWithLatestLaunchesOption(launchFilter, launchPageable.getSort(), isLatest)
								.with(launchPageable)
								.build())
						.selectDistinct(ITEM_ATTRIBUTE.KEY)
						.from(ITEM_ATTRIBUTE)
						.join(TEST_ITEM)
						.on(ITEM_ATTRIBUTE.ITEM_ID.eq(TEST_ITEM.ITEM_ID)
								.and(TEST_ITEM.HAS_STATS)
								.and(TEST_ITEM.HAS_CHILDREN.isFalse())
								.and(TEST_ITEM.RETRY_OF.isNull()))
						.join(LAUNCHES)
						.on(TEST_ITEM.LAUNCH_ID.eq(fieldName(LAUNCHES, ID).cast(Long.class)))
						.where(ITEM_ATTRIBUTE.SYSTEM.isFalse())
						.and(ITEM_ATTRIBUTE.KEY.likeIgnoreCase(DSL.val("%" + DSL.escape(keyPart, '\\') + "%")))
						.unionAll(dslContext.selectDistinct(ITEM_ATTRIBUTE.KEY)
								.from(ITEM_ATTRIBUTE)
								.join(LAUNCHES)
								.on(ITEM_ATTRIBUTE.LAUNCH_ID.eq(fieldName(LAUNCHES, ID).cast(Long.class)))
								.where(ITEM_ATTRIBUTE.SYSTEM.isFalse())
								.and(ITEM_ATTRIBUTE.KEY.likeIgnoreCase(DSL.val("%" + DSL.escape(keyPart, '\\') + "%")))))
				.groupBy(fieldName(KEY))
				.orderBy(DSL.length(fieldName(KEY).cast(String.class)))
				.limit(ATTRIBUTES_LIMIT)
				.fetchInto(String.class);
	}

	@Override
	public List<String> findLaunchAttributeKeys(Long projectId, String value, boolean system) {
		return dslContext.selectDistinct(ITEM_ATTRIBUTE.KEY)
				.from(ITEM_ATTRIBUTE)
				.leftJoin(LAUNCH)
				.on(ITEM_ATTRIBUTE.LAUNCH_ID.eq(LAUNCH.ID))
				.leftJoin(PROJECT)
				.on(LAUNCH.PROJECT_ID.eq(PROJECT.ID))
				.where(PROJECT.ID.eq(projectId))
				.and(ITEM_ATTRIBUTE.SYSTEM.eq(system))
				.and(ITEM_ATTRIBUTE.KEY.likeIgnoreCase("%" + DSL.escape(value, '\\') + "%"))
				.fetch(ITEM_ATTRIBUTE.KEY);
	}

	public List<Long> getLaunchIdsByValues(Long projectId, List<String> values) {
		List<Long> tmpList;
		List<Long> myList = new ArrayList<Long>();
		boolean firsttime = true;
		for(String value : values) {
			tmpList = dslContext.select(LAUNCH.ID)
			.from(LAUNCH)
			.join(ITEM_ATTRIBUTE)
			.on(ITEM_ATTRIBUTE.LAUNCH_ID.eq(LAUNCH.ID))
			.where(LAUNCH.PROJECT_ID.eq(projectId))
			.and(ITEM_ATTRIBUTE.SYSTEM.eq(false))
			.and(ITEM_ATTRIBUTE.VALUE.likeIgnoreCase("%" + DSL.escape(value, '\\') + "%"))
			.fetchInto(Long.class);

			if(firsttime) {
				myList.addAll(tmpList);
				firsttime = false;
			} else {
				myList.retainAll(tmpList);
			}
		}
		return myList;
	}

	public List<Long> getLaunchIdsByKeys(Long projectId, List<String> keys) {
		List<Long> tmpList;
		List<Long> myList = new ArrayList<Long>();
		boolean firsttime = true;
		for(String key : keys) {
			tmpList = dslContext.select(LAUNCH.ID)
			.from(LAUNCH)
			.join(ITEM_ATTRIBUTE)
			.on(ITEM_ATTRIBUTE.LAUNCH_ID.eq(LAUNCH.ID))
			.where(LAUNCH.PROJECT_ID.eq(projectId))
			.and(ITEM_ATTRIBUTE.SYSTEM.eq(false))
			.and(ITEM_ATTRIBUTE.KEY.likeIgnoreCase("%" + DSL.escape(key, '\\') + "%"))
			.fetchInto(Long.class);

			if(firsttime) {
				myList.addAll(tmpList);
				firsttime = false;
			} else {
				myList.retainAll(tmpList);
			}
		}
		return myList;
	}

	public List<Long> findLaunchIdsByValuesKeys(Long projectId, List<String> values, List<String> keys) {
		if (!keys.isEmpty() && !values.isEmpty()) {
			List<Long> valuesList = getLaunchIdsByValues(projectId, values);
			List<Long> keysList = getLaunchIdsByKeys(projectId, keys);
			keysList.retainAll(valuesList);
			return keysList;
		} else if (keys.isEmpty() && !values.isEmpty()) {
			return getLaunchIdsByValues(projectId, values);
		} else if (!keys.isEmpty() && values.isEmpty()) {
			return getLaunchIdsByKeys(projectId, keys);
		} else {
			return dslContext.select(LAUNCH.ID)
				.from(LAUNCH)
				.where(LAUNCH.PROJECT_ID.eq(projectId))
				.fetchInto(Long.class);
		}
	}

	@Override
	public List<String> findLaunchAttributeValues(Long projectId, String key, String value, boolean system) {
		Condition condition = prepareFetchingValuesCondition(PROJECT.ID, projectId, key, value, system);
		return dslContext.selectDistinct(ITEM_ATTRIBUTE.VALUE)
				.from(ITEM_ATTRIBUTE)
				.leftJoin(LAUNCH)
				.on(ITEM_ATTRIBUTE.LAUNCH_ID.eq(LAUNCH.ID))
				.leftJoin(PROJECT)
				.on(LAUNCH.PROJECT_ID.eq(PROJECT.ID))
				.where(condition)
				.fetch(ITEM_ATTRIBUTE.VALUE);
	}

	@Override
	public List<String> findTestItemAttributeKeys(Long launchId, String value, boolean system) {
		return dslContext.selectDistinct(ITEM_ATTRIBUTE.KEY)
				.from(ITEM_ATTRIBUTE)
				.leftJoin(TEST_ITEM)
				.on(ITEM_ATTRIBUTE.ITEM_ID.eq(TEST_ITEM.ITEM_ID))
				.leftJoin(LAUNCH)
				.on(TEST_ITEM.LAUNCH_ID.eq(LAUNCH.ID))
				.where(LAUNCH.ID.eq(launchId))
				.and(ITEM_ATTRIBUTE.SYSTEM.eq(system))
				.and(ITEM_ATTRIBUTE.KEY.likeIgnoreCase("%" + DSL.escape(value, '\\') + "%"))
				.fetch(ITEM_ATTRIBUTE.KEY);
	}

	@Override
	public List<String> findTestItemAttributeValues(Long launchId, String key, String value, boolean system) {
		Condition condition = prepareFetchingValuesCondition(LAUNCH.ID, launchId, key, value, system);
		return dslContext.selectDistinct(ITEM_ATTRIBUTE.VALUE)
				.from(ITEM_ATTRIBUTE)
				.leftJoin(TEST_ITEM)
				.on(ITEM_ATTRIBUTE.ITEM_ID.eq(TEST_ITEM.ITEM_ID))
				.leftJoin(LAUNCH)
				.on(TEST_ITEM.LAUNCH_ID.eq(LAUNCH.ID))
				.where(condition)
				.fetch(ITEM_ATTRIBUTE.VALUE);
	}

	@Override
	public int saveByItemId(Long itemId, String key, String value, boolean isSystem) {
		return dslContext.insertInto(ITEM_ATTRIBUTE)
				.columns(ITEM_ATTRIBUTE.KEY, ITEM_ATTRIBUTE.VALUE, ITEM_ATTRIBUTE.ITEM_ID, ITEM_ATTRIBUTE.SYSTEM)
				.values(key, value, itemId, isSystem)
				.execute();
	}

	@Override
	public int saveMultiple(List<ItemAttributePojo> itemAttributes) {

		InsertValuesStep4<JItemAttributeRecord, Long, String, String, Boolean> columns = dslContext.insertInto(ITEM_ATTRIBUTE)
				.columns(ITEM_ATTRIBUTE.ITEM_ID, ITEM_ATTRIBUTE.KEY, ITEM_ATTRIBUTE.VALUE, ITEM_ATTRIBUTE.SYSTEM);

		itemAttributes.forEach(pojo -> columns.values(pojo.getItemId(), pojo.getKey(), pojo.getValue(), pojo.isSystem()));

		return columns.execute();
	}

	private Condition prepareFetchingValuesCondition(TableField<? extends Record, Long> field, Long id, String key, String value,
			boolean system) {
		Condition condition = field.eq(id)
				.and(ITEM_ATTRIBUTE.SYSTEM.eq(system))
				.and(ITEM_ATTRIBUTE.VALUE.likeIgnoreCase("%" + (value == null ? "" : DSL.escape(value, '\\') + "%")));
		if (key != null) {
			condition = condition.and(ITEM_ATTRIBUTE.KEY.eq(key));
		}
		return condition;
	}

}