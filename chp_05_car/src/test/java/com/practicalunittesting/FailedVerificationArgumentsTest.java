package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class FailedVerificationArgumentsTest {

    private Car myFerrari = mock(Car.class);

    @Test
    public void testVerificationFailureArguments() {
        myFerrari.driveTo("Sweet home Alabama");
        verify(myFerrari).driveTo("Sweet home Honolulu");
    }
}
