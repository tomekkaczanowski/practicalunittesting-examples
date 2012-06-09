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
public class RaceResultsServiceFirstAndSecondRefactoredTest {

    private RaceResultsService raceResults;
    private Message message;
    private Client clientA;
    private Client clientB;

    @BeforeMethod
    protected void setUp() throws Exception {
        raceResults = new RaceResultsService();
        message = mock(Message.class);
        clientA = mock(Client.class);
        clientB = mock(Client.class);
    }

    public void subscribedClientShouldReceiveMessage() {
        raceResults.addSubscriber(clientA);
        raceResults.send(message);

        verify(clientA).receive(message);
    }

    public void allSubscribedClientsShouldReceiveMessages() {
        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientB);
        raceResults.send(message);

        verify(clientA).receive(message);
        verify(clientB).receive(message);
    }
}