package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class HelloTest {

    public void shouldSayGoodMorningInTheMorning() {
        Hello hello = new Hello();
        assertEquals(hello.sayHello(), "Good Morning!");
    }

    public void shouldSayGoodAfternoonInTheAfternoon() {
        Hello hello = new Hello();
        assertEquals(hello.sayHello(), "Good Afternoon!");
    }
}
