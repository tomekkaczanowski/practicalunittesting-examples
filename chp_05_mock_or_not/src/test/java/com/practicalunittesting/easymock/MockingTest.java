package com.practicalunittesting.easymock;

import com.practicalunittesting.Client;
import com.practicalunittesting.Phone;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.easymock.EasyMock.*;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Sample code for "Developers test: From beginner to master" book.
 * Tomasz Kaczanowski
 * http://kaczanowscy.pl/tomek
 * Sep 27, 2010, 9:17:04 PM
 */
@Test
public class MockingTest {
    private final static Phone MOBILE_PHONE = createNiceMock(Phone.class);
    private final static Phone STATIONARY_PHONE = createNiceMock(Phone.class);

    private Client client;

    @BeforeMethod
    public void setUp() {
        client = new Client();
    }

    public void shouldReturnTrueIfClientHasMobile() {
        expect(MOBILE_PHONE.isMobile()).andStubReturn(true);
        replay(MOBILE_PHONE);
        client.addPhone(MOBILE_PHONE);
        client.addPhone(STATIONARY_PHONE);
        assertTrue(client.hasMobile());
    }

    public void shouldReturnFalseIfClientHasNoMobile() {
        client.addPhone(STATIONARY_PHONE);
        assertFalse(client.hasMobile());
    }
}
