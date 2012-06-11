package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Phone {
    private final String number;

    public Phone(String number) {
        if (null == number || number.isEmpty()) {
            throw new IllegalArgumentException("number can not be null or empty");
        }
        if (number.startsWith("+")) {
            throw new IllegalArgumentException(
                    "plus sign prefix not allowed, number: [" + number + "]");
        }
        this.number = number;
    }
}
