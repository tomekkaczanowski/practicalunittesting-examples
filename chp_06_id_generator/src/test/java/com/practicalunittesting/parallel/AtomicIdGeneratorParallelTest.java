package com.practicalunittesting.parallel;

import com.practicalunittesting.AtomicIdGenerator;
import com.practicalunittesting.IdGenerator;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertTrue;

/**
 * Sometimes will pass, sometimes will fail.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class AtomicIdGeneratorParallelTest {

	private IdGenerator idGen = new AtomicIdGenerator();
	private Set<Long> ids = new HashSet<Long>(100);

	@Test(threadPoolSize = 7, invocationCount = 1000, skipFailedInvocations = true)
	public void idsShouldBeUnique() {
		assertTrue(ids.add(idGen.nextId()));
	}
}
