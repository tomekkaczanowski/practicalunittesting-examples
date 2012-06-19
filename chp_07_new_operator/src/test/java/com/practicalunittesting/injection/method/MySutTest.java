package com.practicalunittesting.injection.method;

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
        MySut sut = new MySut();
        MyCollaborator collaborator = mock(MyCollaborator.class);

        sut.myMethod(collaborator);

        //TODO what now?
    }
}
