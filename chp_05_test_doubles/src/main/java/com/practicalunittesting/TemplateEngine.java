package com.practicalunittesting.blah;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface TemplateEngine {

    String prepareMessage(Template msgTemplate, Client client);

}
