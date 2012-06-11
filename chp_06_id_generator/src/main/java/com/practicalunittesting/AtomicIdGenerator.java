package com.practicalunittesting;

/**
 * This will (usually) pass normal test but will (usually) fail on parallel
 * test.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AtomicIdGenerator implements IdGenerator {

	private static Long nextId = System.currentTimeMillis();

	public Long nextId() {
		return nextId++;
	}
}
