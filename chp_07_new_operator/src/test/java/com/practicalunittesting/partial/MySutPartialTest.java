package com.practicalunittesting.partial;

import com.practicalunittesting.MyCollaborator;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertTrue;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySutPartialTest {

    @Test
    public void testMyMethod() {
        MyPartialSut sut = spy(new MyPartialSut());
        MyCollaborator collaborator = mock(MyCollaborator.class);

        doReturn(collaborator).when(sut).createCollaborator();
        //when(sut.createCollaborator()).thenReturn(collaborator);
        when(collaborator.someMethod()).thenReturn(true);

        assertTrue(sut.myMethod());
    }
}
