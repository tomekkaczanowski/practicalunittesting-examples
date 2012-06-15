package com.practicalunittesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class AddressParsingOneAssert {

    private Address anAddress;

    @BeforeMethod
    public void setUp(){
        anAddress = new Address("ADDR1$CITY IL 60563$COUNTRY");
    }

    public void testAddr1() {
        assertEquals("ADDR1",  anAddress.getAddr1());
    }

    public void testCsp() {
        assertEquals("CITY IL 60563",  anAddress.getCsp());
    }

    public void testCountry() {
        assertEquals("COUNTRY",  anAddress.getCountry());
    }
}
