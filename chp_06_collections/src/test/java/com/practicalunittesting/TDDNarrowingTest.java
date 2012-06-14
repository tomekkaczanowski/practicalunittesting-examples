package com.practicalunittesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class TDDNarrowingTest {

    class User {

        private List<String> phones = new ArrayList<String>();

        public List<String> getPhones() {
        return phones;
        }

        public void addPhone(String s) {
            phones.add(s);
        }
    }

    private User user;

    @BeforeMethod
    public void setUp() {
        user = new User();
    }

    public void newUserHasNoPhone() {
        assertNotNull(user.getPhones());
        assertTrue(user.getPhones().isEmpty());
    }

    @Test(dependsOnMethods = "newUserHasNoPhone")
    public void shouldReturnAllPhonesOfUser() {
        user.addPhone("123 456 789");
        List<String> phones = user.getPhones();
        assertNotNull(phones);
        assertFalse(phones.isEmpty());
        assertEquals(phones.size(), 1);
        assertTrue(phones.contains("123 456 789"));
    }
}
