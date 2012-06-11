package com.practicalunittesting;

/**
 * Interface for all ID generators.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface IdGenerator {

    /**
     * @return unique id
     */
	Long nextId();
}