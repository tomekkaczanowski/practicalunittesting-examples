package com.practicalunittesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class MoneyTest {

    public void testConstructor() {
        Money money = new Money(10, "USD");
        assertEquals(money.getAmount(), 10);
        //assertEquals(money.getAmount(), 15);
        //assertEquals(money.getAmount(), 10, "wrong amount of money");
        assertEquals(money.getCurrency(), "USD");
    }

    @DataProvider
    private static final Object[][] getMoney(){
        return new Object[][] {
                {new Money(4, "USD"), new Money(3, "USD"), 7},
                {new Money(1, "EUR"), new Money(4, "EUR"), 5},
                {new Money(1234, "CHF"), new Money(234, "CHF"), 1468}};
    }

    @Test(dataProvider = "getMoney")
    public void shouldAddSameCurrencies(Money a, Money b,
                                        int expectedResult) {
        Money result = a.add(b);
        assertEquals(result.getAmount(), expectedResult);
    }

}
