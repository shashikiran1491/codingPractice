package com.java.practice.chainofresponsibility;

public class Request {

    Priority priority;

    public Priority getPriority() {
        return priority;
    }

    public Request(Priority priority) {
        this.priority = priority;
    }
}
