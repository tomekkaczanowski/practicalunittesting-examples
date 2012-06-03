package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class IDEQuicFixTest {

    @Test
    public void testConstructor() {
        Client client = new Client();
        client.setAge(20);
        assertEquals(client.getAge(), 20);
    }
}
