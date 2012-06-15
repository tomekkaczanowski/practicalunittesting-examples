package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class AddressParsingManyAsserts {

    public void testAddressParsing() {
        Address anAddress = new Address("ADDR1$CITY IL 60563$COUNTRY");
        assertEquals("ADDR1",  anAddress.getAddr1());
        assertEquals("CITY IL 60563",  anAddress.getCsp());
        assertEquals("COUNTRY",  anAddress.getCountry());
    }
}
