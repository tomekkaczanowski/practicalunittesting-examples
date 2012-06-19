package com.practicalunittesting.injection.constructor;

import com.practicalunittesting.MyCollaborator;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySutTest {

    @Test
    public void testMyMethod() {
        MyCollaborator collaborator = mock(MyCollaborator.class);
        MySut sut = new MySut(collaborator);

        // normal Mockito stubbing/test spying test
    }
}
