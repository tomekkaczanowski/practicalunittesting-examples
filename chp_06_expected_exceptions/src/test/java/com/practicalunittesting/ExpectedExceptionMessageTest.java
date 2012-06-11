package com.practicalunittesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ExpectedExceptionMessageTest {

    @DataProvider
    private static final Object[][] emptyNumbers(){
        return new Object[][] {{null}, {""}};
    }

    @Test(dataProvider = "emptyNumbers", expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = ".*empty.*" )
    public void shouldThrowIAEForEmptyNumber(String emptyNumber) {
        new Phone(emptyNumber);
    }

    @DataProvider
    private static final Object[][] numbersWithPlus(){
        return new Object[][] {{"+123"}, {"+456 789 012"}};
    }

    @Test(dataProvider = "numbersWithPlus", expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = ".*plus.*" )
    public void shouldThrowIAEForPlusPrefixedNumber(String numberWithPlus) {
        new Phone(numberWithPlus);
    }
}
