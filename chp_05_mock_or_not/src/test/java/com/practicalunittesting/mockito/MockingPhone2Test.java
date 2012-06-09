package com.practicalunittesting.mockito;

import com.practicalunittesting.Client2;
import com.practicalunittesting.Phone2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Sample code for "Developers test: From beginner to master" book.
 * Tomasz Kaczanowski
 * http://kaczanowscy.pl/tomek
 * Sep 27, 2010, 9:17:04 PM
 */
@Test
public class MockingPhone2Test {
    private final static Phone2 MOBILE_PHONE = mock(Phone2.class);
    private final static Phone2 STATIONARY_PHONE = mock(Phone2.class);

    private Client2 client;

    @BeforeMethod
    public void setUp() {
        client = new Client2();
    }

    public void shouldReturnTrueIfClientHasMobile() {
        when(MOBILE_PHONE.isMobile()).thenReturn(true);

        client.addPhone(MOBILE_PHONE);
        client.addPhone(STATIONARY_PHONE);
        assertTrue(client.hasMobile());
    }

    public void shouldReturnFalseIfClientHasNoMobile() {
        client.addPhone(STATIONARY_PHONE);
        assertFalse(client.hasMobile());
    }
}
