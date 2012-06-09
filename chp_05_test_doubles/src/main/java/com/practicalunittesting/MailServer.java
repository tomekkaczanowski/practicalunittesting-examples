package com.practicalunittesting.blah;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface MailServer {
    void send(String email, String msgContent);

    void send(Client client, String msgContent);
}
