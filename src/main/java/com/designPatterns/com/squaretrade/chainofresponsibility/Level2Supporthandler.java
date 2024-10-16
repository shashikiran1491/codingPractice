package com.squaretrade.chainofresponsibility;

import static com.squaretrade.chainofresponsibility.Priority.INTERMEDIATE;

public class Level2Supporthandler implements SupportHandler{

    SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(INTERMEDIATE == request.getPriority()) {
            System.out.println("request handled by Level 2");
        } else {
            nextHandler.handleRequest(request);
        }

    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
