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

package com.epam.ta.reportportal.entity.enums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
class ActivityEventTypeTest {

	private Map<ActivityEventType, List<String>> allowed;
	private List<String> disallowed;

	@BeforeEach
	void setUp() throws Exception {
		allowed = Arrays.stream(ActivityEventType.values())
				.collect(Collectors.toMap(it -> it,
						it -> Arrays.asList(it.getValue(), it.getValue().toUpperCase(), it.getValue().toLowerCase())
				));
		disallowed = Arrays.asList("bla", null, "", "noSuchActivityEventType");
	}

	@Test
	void fromString() {
		allowed.forEach((key, value) -> value.forEach(val -> {
			final Optional<ActivityEventType> optional = ActivityEventType.fromString(val);
			assertTrue(optional.isPresent());
			assertEquals(key, optional.get());
		}));
		disallowed.forEach(it -> assertFalse(ActivityEventType.fromString(it).isPresent()));
	}
}