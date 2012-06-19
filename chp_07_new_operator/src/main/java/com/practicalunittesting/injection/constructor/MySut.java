package com.practicalunittesting.injection.constructor;

import com.practicalunittesting.MyCollaborator;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySut {

    private final MyCollaborator collab;

    public MySut(MyCollaborator collab) {
        this.collab = collab;
    }
    public void myMethod() {
        // some behaviour worth testing here which uses collaborator
    }
}
