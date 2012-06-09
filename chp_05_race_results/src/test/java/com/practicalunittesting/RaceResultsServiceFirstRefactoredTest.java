package com.practicalunittesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class RaceResultsServiceFirstRefactoredTest {

    private RaceResultsService raceResults;
    private Client client;
    private Message message;

    @BeforeMethod
    public void setUp() {
        raceResults = new RaceResultsService();
        client = mock(Client.class);
        message = mock(Message.class);
    }

    public void subscribedClientShouldReceiveMessage() {
        raceResults.addSubscriber(client);
        raceResults.send(message);
        verify(client).receive(message);
    }

}