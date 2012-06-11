package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class StubbingVoidTest {

    private MyClass someObject = mock(MyClass.class);

    public void stubbingTypicalVoidMethod() {
        when(someObject.someMethod()).thenReturn("some value");
        
        assertEquals(someObject.someMethod(), "some value");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void stubbingVoidMethodToThrowException() {
        // the compiler will not allow to do this
        //when(someObject.voidMethod()).thenThrow(new IllegalArgumentException("bad argument!"));
        doThrow(new IllegalArgumentException("bad argument!")).when(someObject).voidMethod();

        someObject.voidMethod();
    }
}
