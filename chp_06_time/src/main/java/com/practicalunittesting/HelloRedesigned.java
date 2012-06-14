package com.practicalunittesting;

import java.util.Calendar;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class HelloRedesigned {

    private TimeProvider timeProvider;

    public HelloRedesigned(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public String sayHello() {
        Calendar current = timeProvider.getTime();
        if (current.get(Calendar.HOUR_OF_DAY) < 12) {
            return "Good Morning!";
        }
        else {
            return "Good Afternoon!";
        }
    }
}
