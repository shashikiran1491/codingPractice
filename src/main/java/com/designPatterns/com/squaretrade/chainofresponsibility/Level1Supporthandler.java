package com.squaretrade.chainofresponsibility;

import static com.squaretrade.chainofresponsibility.Priority.BASIC;

public class Level1Supporthandler implements SupportHandler{

    SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(BASIC == request.getPriority()) {
            System.out.println("request handled by Level 1");
        } else {
            nextHandler.handleRequest(request);
        }

    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
