package com.epam.ta.reportportal.database.dao;

import com.epam.ta.reportportal.BaseDaoTest;
import com.epam.ta.reportportal.database.BinaryData;
import com.epam.ta.reportportal.database.DataStorage;
import com.epam.ta.reportportal.database.entity.BinaryContent;
import com.epam.ta.reportportal.database.entity.Log;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.epam.ta.reportportal.database.search.ModifiableQueryBuilder.findModifiedLaterThanPeriod;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;

public class LogRepositoryTest extends BaseDaoTest {

	public static final String CONTENT_TYPE = "image/png";

	@Autowired
	private LogRepository logRepository;
	@Autowired
	private DataStorage dataStorage;

	private Log saved;
	private String filename;
	private String thumbnail;

	@Before
	public void addLogWithBinaryData() {
		Map<String, String> metaInfo = new HashMap<>();
		metaInfo.put("project", "EPMRPP");
		BinaryData binaryData = new BinaryData(CONTENT_TYPE, 64807L, this.getClass().getClassLoader().getResourceAsStream("meh.jpg"));
		filename = dataStorage.saveData(binaryData, "filename", metaInfo);
		thumbnail = dataStorage.saveData(binaryData, "thumbnail", metaInfo);
		BinaryContent binaryContent = new BinaryContent(filename, thumbnail, CONTENT_TYPE);
		Log log = new Log();
		log.setBinaryContent(binaryContent);
		saved = logRepository.save(log);
	}

	@Test
	public void deleteLogTriggerTest() {
		assertTrue(logRepository.exists(saved.getId()));
		assertNotNull(dataStorage.fetchData(thumbnail));
		assertNotNull(dataStorage.fetchData(filename));
		logRepository.delete(singletonList(saved.getId()));
		assertFalse(logRepository.exists(saved.getId()));
		assertNull(dataStorage.fetchData(thumbnail));
		assertNull(dataStorage.fetchData(filename));
	}

	@Test
	public void findIdsByItemIds() {
		logRepository.save(logs());
		List<String> logIdsByItemRefs = logRepository.findLogIdsByItemRefs(asList("item1", "item2"));
		assertFalse(logIdsByItemRefs.isEmpty());
		assertEquals(3, logIdsByItemRefs.size());
	}

	@Test
	public void findBinaryIds() {
		List<Log> save = logRepository.save(logs());
		List<String> binaryIds = logRepository.findBinaryIdsByLogRefs(save.stream().map(Log::getId).collect(toList()));
		assertFalse(binaryIds.isEmpty());
		assertEquals(6, binaryIds.size());
	}

	@Test
	public void findLogIdsByItemRefs() {
		final List<Log> logs = logs();
		logRepository.save(logs);
		final List<String> byItemRefs = logRepository.findLogIdsByItemRefs(asList("item1", "item2"));
		Assertions.assertThat(byItemRefs).hasSize(3).hasSameElementsAs(logs.stream().map(Log::getId).collect(toList()));
	}

	@Test
	public void deleteByItemRef() {
		final String itemRef = "itemRef";
		final Log log = new Log();
		log.setTestItemRef(itemRef);
		logRepository.save(log);
		logRepository.deleteByItemRef(singletonList(itemRef));
		Assert.assertFalse(logRepository.exists(log.getId()));

	}

	@Test
	public void findModifiedLaterAgo() {
		final Log log = new Log();
		logRepository.save(log);
		List<Log> logs = mongoTemplate.find(findModifiedLaterThanPeriod(Duration.ofHours(-26)), Log.class);
		Assert.assertTrue(logs.size() == 2);
		Assert.assertTrue(logs.contains(saved));
	}

	@Test
	public void removeBinaryContent() {
		List<Log> all = logRepository.findAll();
		logRepository.removeBinaryContent(all.stream().map(it -> it.getBinaryContent().getBinaryDataId()).collect(toList()));
		List<Log> res = logRepository.findAll();
		res.forEach(it -> Assert.assertNull(it.getBinaryContent()));
	}

	@After
	public void cleanup() {
		logRepository.deleteAll();
	}

	public List<Log> logs() {
		Log log1 = new Log();
		log1.setTestItemRef("item1");
		log1.setBinaryContent(new BinaryContent("binary1", "thumbnail1", "contentType1"));
		Log log2 = new Log();
		log2.setTestItemRef("item1");
		log2.setBinaryContent(new BinaryContent("binary2", "thumbnail2", "contentType2"));
		Log log3 = new Log();
		log3.setTestItemRef("item2");
		log3.setBinaryContent(new BinaryContent("binary3", "thumbnail3", "contentType3"));
		return asList(log1, log2, log3);
	}
}
