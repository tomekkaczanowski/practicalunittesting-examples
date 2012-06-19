package com.practicalunittesting.partial;

import com.practicalunittesting.MyCollaborator;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MyPartialSut {

    public boolean myMethod() {
        MyCollaborator collaborator = createCollaborator();
        if (collaborator.someMethod()) {
            return true;
        }
        else {
            return false;
        }
        // some behaviour worth testing here which uses collaborator
    }

    MyCollaborator createCollaborator() {
        return new MyCollaborator();
    }
}
