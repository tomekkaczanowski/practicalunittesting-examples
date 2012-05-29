package com.practicalunittesting.data;

import com.practicalunittesting.Money;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MoneyTestExternalDataProvider {

    @Test(dataProvider = "getMoney", dataProviderClass = MoneyDataProvider.class)
    public void testConstructorWithDataProvider(int amount, String currency) {
        Money money = new Money(amount, currency);
        assertEquals(money.getAmount(), amount);
        assertEquals(money.getCurrency(), currency);
    }

}
