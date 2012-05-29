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
public class MoneyManyValuesTest {

    public void testConstructor() {
        Money money = new Money(10, "USD");
        assertEquals(money.getAmount(), 10);
        assertEquals(money.getCurrency(), "USD");
        money = new Money(20, "EUR");
        assertEquals(money.getAmount(), 20);
        assertEquals(money.getCurrency(), "EUR");
    }

}
