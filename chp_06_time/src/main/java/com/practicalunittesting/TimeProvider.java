package com.practicalunittesting;

import java.util.Calendar;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface TimeProvider {

    /**
     * Allows for taking control over time in unit tests.
     * A default implementation should return system calendar (Calendar.getInstance());
     */
    Calendar getTime();
}
