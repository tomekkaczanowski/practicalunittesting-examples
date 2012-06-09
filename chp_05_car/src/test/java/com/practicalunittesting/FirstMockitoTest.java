package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class FirstMockitoTest {

    private Car myFerrari = mock(Car.class);

    @Test
    public void testIfCarIsACar() {
        assertTrue(myFerrari instanceof Car);
    }

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        assertFalse(myFerrari.needsFuel(),
                "new test double should return false as boolean");
        assertEquals(myFerrari.getEngineTemperature(), 0.0,
                "new test double should return 0.0 as double");
    }

    @Test
    public void testStubbing() {
        assertFalse(myFerrari.needsFuel(),
                        "new test double should return false as boolean");
        when(myFerrari.needsFuel()).thenReturn(true);
        assertTrue(myFerrari.needsFuel(),
                "after instructed test double should return what we want");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void throwException() {
        when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
        myFerrari.needsFuel();
    }
}
