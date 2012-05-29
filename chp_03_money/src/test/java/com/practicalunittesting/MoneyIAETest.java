package com.practicalunittesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class MoneyIAETest {

    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";

    @DataProvider
    private static final Object[][] getInvalidAmount(){
        return new Integer[][] {{-12387}, {-5}, {-1}};
    }

    @DataProvider
    private static final Object[][] getInvalidCurrency(){
        return new String[][] {{null}, {""}};
    }

    @Test(dataProvider = "getInvalidAmount", expectedExceptions = IllegalArgumentException.class)
    public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) {
        Money money = new Money(invalidAmount, VALID_CURRENCY);
    }

    @Test(dataProvider = "getInvalidCurrency", expectedExceptions = IllegalArgumentException.class)
    public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency) {
        Money money = new Money(VALID_AMOUNT, invalidCurrency);
    }
}
