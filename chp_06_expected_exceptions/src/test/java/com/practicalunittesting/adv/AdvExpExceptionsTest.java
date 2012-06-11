package com.practicalunittesting.adv;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.mockito.Mockito.mock;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AdvExpExceptionsTest {

    Request request;
    RequestProcessor requestProcessor;
    RequestHandler sut;

    @BeforeMethod
    public void setUp() {
        request = createInvalidRequest();
        requestProcessor = mock(RequestProcessor.class);
        sut = new RequestHandler(requestProcessor);
    }

    @Test
    public void shouldNotProcessInvalidRequests() {
        Request request = createInvalidRequest();
        RequestProcessor requestProcessor = mock(RequestProcessor.class);
        RequestHandler sut = new RequestHandler(requestProcessor);
        try {
            sut.handle(request);
            fail("Should have thrown InvalidRequestException");
        } catch (InvalidRequestException e) {
            Mockito.verifyZeroInteractions(requestProcessor);
        }
    }

    @Test(expectedExceptions = InvalidRequestException.class)
    public void shouldThrowExceptionForInvalidRequest() throws InvalidRequestException {
            sut.handle(request);
    }

    @Test
    public void shouldNotProcessInvalidRequest() {
        try {
            sut.handle(request);
        } catch (InvalidRequestException e) {
        }
        Mockito.verifyZeroInteractions(requestProcessor);
    }

    private Request createInvalidRequest() {
        return null;
    }

    @Test
    public void shouldThrowExceptions() throws InvalidRequestException {
        Request request = createInvalidRequest();
        RequestProcessor requestProcessor = mock(RequestProcessor.class);

        RequestHandler sut = new RequestHandler(requestProcessor);

        catchException(sut).handle(request);

         assertTrue(caughtException() instanceof InvalidRequestException,
                "Should have thrown exception of InvalidRequestException class");

        Mockito.verifyZeroInteractions(requestProcessor);
    }

}
