package com.practicalunittesting.bdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class TryCatchBDD {

    SUT sut = new SUT();

    @Test
    public void shouldThrowExceptions() {
       // given
        Exception exception = null;
        // some code here

        // when
        try {
            sut.methodWhichShouldThrowMyException();
        }
        catch(Exception e) {
            exception = e;
        }

        // then
        assertTrue(exception instanceof MyException,
                "Should have thrown exception of MyException class");
    }
}
