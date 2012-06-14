package com.practicalunittesting;

import org.joda.time.DateTimeUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Calendar;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class HelloJodaTimeTest {

    private Hello hello;

    @BeforeMethod
    public void setUp() {
        hello = new Hello();
    }

    public void shouldSayGoodMorningInTheMorning() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY, 9);
        DateTimeUtils.setCurrentMillisFixed(now.getTimeInMillis());
        assertEquals(hello.sayHello(), "Good Morning!");
    }

    public void shouldSayGoodAfternoonInTheAfternoon() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY, 18);
        DateTimeUtils.setCurrentMillisFixed(now.getTimeInMillis());
        assertEquals(hello.sayHello(), "Good Afternoon!");
    }

}
