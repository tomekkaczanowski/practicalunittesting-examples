package com.practicalunittesting;

/**
 * This will (usually) fail both normal and parallel test.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class SystemIdGenerator implements IdGenerator {

	public Long nextId() {
		return System.currentTimeMillis();
	}
}
