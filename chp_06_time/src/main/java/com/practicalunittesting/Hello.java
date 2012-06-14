package com.practicalunittesting;

import java.util.Calendar;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Hello {

    public String sayHello() {
        Calendar current = Calendar.getInstance();
        if (current.get(Calendar.HOUR_OF_DAY) < 12) {
            return "Good Morning!";
        }
        else {
            return "Good Afternoon!";
        }
    }
}
