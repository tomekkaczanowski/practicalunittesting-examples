package com.practicalunittesting;

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
public class RaceResultsServiceFirstAndSecondTest {

    public void subscribedClientShouldReceiveMessage() {
        RaceResultsService raceResults = new RaceResultsService();
        Client client = mock(Client.class);
        Message message = mock(Message.class);

        raceResults.addSubscriber(client);
        raceResults.send(message);

        verify(client).receive(message);
    }

    public void messageShouldBeSentToAllSubscribedClients() {
        RaceResultsService raceResults = new RaceResultsService();
        Client clientA = mock(Client.class);
        Client clientB = mock(Client.class);
        Message message = mock(Message.class);

        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientB);
        raceResults.send(message);
        verify(clientA).receive(message);
        verify(clientB).receive(message);
    }
}