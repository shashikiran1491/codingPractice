package com.java.practice.state.atmmachine;

public interface AtmState {

    void insertCard();

    void ejectCard();

    void insertPin(int pin);

    void requestCash(int cash);

}
