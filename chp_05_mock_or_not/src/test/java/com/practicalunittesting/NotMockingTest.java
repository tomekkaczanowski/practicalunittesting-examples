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
public class NotMockingTest {
    private final static String ANY_NUMBER = "999-888-777";
    private final static Phone MOBILE_PHONE = new Phone(ANY_NUMBER, true);
    private final static Phone STATIONARY_PHONE = new Phone(ANY_NUMBER, false);

    private Client client;

    @BeforeMethod
    public void setUp() {
        client = new Client();}

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
