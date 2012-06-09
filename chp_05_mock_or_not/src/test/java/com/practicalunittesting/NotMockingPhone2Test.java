package com.practicalunittesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Sample code for "Developers test: From beginner to master" book.
 * Tomasz Kaczanowski
 * http://kaczanowscy.pl/tomek
 * Sep 27, 2010, 9:17:04 PM
 */
@Test
public class NotMockingPhone2Test {
    private final static Phone2 MOBILE_PHONE = new Phone2("+123456789");
    private final static Phone2 STATIONARY_PHONE = new Phone2("123123123");

    private Client2 client;

    @BeforeMethod
    public void setUp() {
        client = new Client2();}

    public void shouldReturnTrueIfClientHasMobile() {
        client.addPhone(MOBILE_PHONE);
        client.addPhone(STATIONARY_PHONE);
        assertTrue(client.hasMobile());
    }

    public void shouldReturnFalseIfClientHasNoMobile() {
        client.addPhone(STATIONARY_PHONE);
        assertFalse(client.hasMobile());
    }
}
