package com.practicalunittesting;

import java.util.Map;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface UserDAO {
    User getUser(long id);

    User getUserByProperties(Map<String, String> properties);
}
