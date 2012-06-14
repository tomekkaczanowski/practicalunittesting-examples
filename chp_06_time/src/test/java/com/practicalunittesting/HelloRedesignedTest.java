package com.practicalunittesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Calendar;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class HelloRedesignedTest {

    private HelloRedesigned hello;
    private TimeProvider timeProvider;

    @DataProvider
    private static final Object[][] morningHours(){
        return new Object[][] { {0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}, {11}};
    }

    @DataProvider
    private static final Object[][] afternoonHours(){
        return new Object[][] { {12}, {13}, {14}, {15}, {16}, {17}, {18}, {19}, {20}, {21}, {22}, {23}};
    }

    @BeforeMethod
    public void setUp() {
        timeProvider = mock(TimeProvider.class);
        hello = new HelloRedesigned(timeProvider);
    }

    @Test(dataProvider = "morningHours")
    public void shouldSayGoodMorningInTheMorning(int hour) {
        when(timeProvider.getTime()).thenReturn(getCalendar(hour));
        assertEquals(hello.sayHello(), "Good Morning!");
    }

    @Test(dataProvider = "afternoonHours")
    public void shouldSayGoodAfternoonInTheAfternoon(int hour) {
        when(timeProvider.getTime()).thenReturn(getCalendar(hour));
        assertEquals(hello.sayHello(), "Good Afternoon!");
    }

    private Calendar getCalendar(int hour) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, hour);
        return cal;
    }
}
