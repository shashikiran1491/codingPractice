package com.java.practice.example4;

public interface Display {

    void show(String msg);

    default int sum(int a, int b) {
        return a + b;
    }

}
