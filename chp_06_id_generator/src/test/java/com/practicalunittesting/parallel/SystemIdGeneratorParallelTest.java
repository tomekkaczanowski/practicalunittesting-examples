package com.practicalunittesting.parallel;

import com.practicalunittesting.IdGenerator;
import com.practicalunittesting.SystemIdGenerator;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertTrue;

/**
 * Will usually fail.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class SystemIdGeneratorParallelTest {

	private IdGenerator idGen = new SystemIdGenerator();

	private Set<Long> ids = new HashSet<Long>(100);

	@Test(threadPoolSize = 7, invocationCount = 100)
	public void idsShouldBeUnique() {
		assertTrue(ids.add(idGen.nextId()));
	}
}
