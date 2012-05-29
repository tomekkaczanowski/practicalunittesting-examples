package com.practicalunittesting.data;

import org.testng.annotations.DataProvider;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MoneyDataProvider {

    @DataProvider
    public static final Object[][] getMoney(){
        return new Object[][] {{10, "USD"}, {20, "EUR"}};
    }
}
