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
public class MoneyDataProviderTest {

    @DataProvider
    private static final Object[][] getMoney(){
        return new Object[][] {{10, "USD"}, {20, "EUR"}};
        //{-7, "BLA"},
    }

    @Test(dataProvider = "getMoney")
    public void testConstructorWithDataProvider(int amount, String currency) {
        Money money = new Money(amount, currency);
        assertEquals(money.getAmount(), amount);
        assertEquals(money.getCurrency(), currency);
    }

}
