package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class ClientNoSetUpTest {

    private Address addressA = new Address("street A");
    private Address addressB = new Address("street B");

    public void afterCreationShouldHaveNoAddress() {
        Client client = new Client();

        assertEquals(client.getAddresses().size(), 0);
    }

    public void shouldAllowToAddAddress() {
        Client client = new Client();

        client.addAddress(addressA);

        assertEquals(client.getAddresses().size(), 1);
        assertTrue(client.getAddresses().contains(addressA));
    }

    public void shouldAllowToAddManyAddresses() {
        Client client = new Client();

        client.addAddress(addressA);
        client.addAddress(addressB);

        assertEquals(client.getAddresses().size(), 2);
        assertTrue(client.getAddresses().contains(addressA));
        assertTrue(client.getAddresses().contains(addressB));
    }
}
