package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Phone2 {
    private final boolean mobile;
    private final String number;

    public Phone2(String number) {
     this.number = number;
     this.mobile = number.startsWith("+") && number.endsWith("9");
    }

    public boolean isMobile() {
        return mobile;
    }
}
