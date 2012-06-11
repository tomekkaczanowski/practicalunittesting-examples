package com.practicalunittesting.adv;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class RequestHandler {

    private final RequestProcessor requestProcessor;

    public RequestHandler(RequestProcessor requestProcessor) {
        this.requestProcessor = requestProcessor;
    }

    public void handle(Request request) throws InvalidRequestException {
        if (invalidRequest(request)) {
            throw new InvalidRequestException();
        }
        requestProcessor.process(request);
    }

    private boolean invalidRequest(Request request) {
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
