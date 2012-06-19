package com.practicalunittesting.powermock;

import com.practicalunittesting.MyCollaborator;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.IObjectFactory;
import org.testng.annotations.ObjectFactory;
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
@PrepareForTest(MySut.class)
public class MySutTest {

    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }

    @Test
    public void testMyMethod() throws Exception {
        MySut sut = new MySut();
        MyCollaborator collaborator = mock(MyCollaborator.class);

        PowerMockito.whenNew(MyCollaborator.class).withNoArguments().thenReturn(collaborator);
        when(collaborator.someMethod()).thenReturn(true);

        assertTrue(sut.myMethod());
    }
}
