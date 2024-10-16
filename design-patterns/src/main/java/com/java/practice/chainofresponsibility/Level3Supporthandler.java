package com.java.practice.chainofresponsibility;

import static com.java.practice.chainofresponsibility.Priority.COMPLEX;

public class Level3Supporthandler implements SupportHandler {

    SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(COMPLEX == request.getPriority()) {
            System.out.println("request handled by Level 3");
        } else if(nextHandler != null){
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled");
        }

    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
