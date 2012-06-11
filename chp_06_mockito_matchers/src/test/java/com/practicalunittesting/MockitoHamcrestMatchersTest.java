package com.practicalunittesting;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.hasEntry;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class MockitoHamcrestMatchersTest {

    public void useOfHamcrestMatchers() {
        User user = new User();
        UserDAO userDAO = mock(UserDAO.class);

        when(userDAO.getUserByProperties(argThat(hasEntry("id", "2")))).thenReturn(user);

        assertNull(userDAO.getUserByProperties(new HashMap<String, String>()));

        Map<String, String> properties = new HashMap<String, String>();
        properties.put("id", "2");

        assertEquals(userDAO.getUserByProperties(properties), user);

    }
}
