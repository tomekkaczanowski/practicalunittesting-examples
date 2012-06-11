package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class MockitoMatchersTest {

    public void useOfMatchers() {
        UserDAO userDAO = mock(UserDAO.class);
        User user = new User();
        when(userDAO.getUser(anyInt())).thenReturn(user);

        assertEquals(userDAO.getUser(1), user);
        assertEquals(userDAO.getUser(2), user);
        assertEquals(userDAO.getUser(3), user);
        
        verify(userDAO, times(3)).getUser(anyInt());

        
    }
}
