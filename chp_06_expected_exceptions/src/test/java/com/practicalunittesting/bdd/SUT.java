package com.practicalunittesting.bdd;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class SUT {
    public void methodWhichShouldThrowMyException() throws MyException {
        throw new MyException();
    }
}
