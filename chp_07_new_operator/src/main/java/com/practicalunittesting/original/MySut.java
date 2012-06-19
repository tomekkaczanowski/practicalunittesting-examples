package com.practicalunittesting.original;

import com.practicalunittesting.MyCollaborator;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySut {

    public void myMethod() {
        MyCollaborator collaborator = new MyCollaborator();
        // some behaviour worth testing here which uses collaborator
    }
}
