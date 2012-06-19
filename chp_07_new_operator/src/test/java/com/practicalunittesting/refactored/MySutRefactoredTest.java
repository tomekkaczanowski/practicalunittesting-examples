package com.practicalunittesting.refactored;

import com.practicalunittesting.MyCollaborator;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertTrue;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySutRefactoredTest {

    private MyCollaborator collaborator;

    class MyRefactoredSutSubclassed extends MyRefactoredSut {
        @Override
        protected MyCollaborator createCollaborator() {
            return collaborator;
        }
    }

    @Test
    public void testMyMethod() {
        MyRefactoredSut sut = new MyRefactoredSutSubclassed();
         collaborator= mock(MyCollaborator.class);

        when(collaborator.someMethod()).thenReturn(true);
        assertTrue(sut.myMethod());
    }
}
