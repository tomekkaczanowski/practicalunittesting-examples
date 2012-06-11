package com.practicalunittesting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Will pass both normal and parallel tests.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class JVMUniqueIdGenerator implements IdGenerator {

	private static final AtomicLong nextId = new AtomicLong(System
			.currentTimeMillis());

	public Long nextId() {
		return nextId.getAndIncrement();
	}
}
