package com.practicalunittesting.refactored;

import com.practicalunittesting.MyCollaborator;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MyRefactoredSut {

    public boolean myMethod() {
        MyCollaborator collaborator = createCollaborator();
        // some behaviour worth testing here which uses collaborator
       if (collaborator.someMethod()) {
            return true;
        }
        else {
            return false;
        }
        // some behaviour worth testing here which uses collaborator
    }

    protected MyCollaborator createCollaborator() {
        return new MyCollaborator();
    }
}
