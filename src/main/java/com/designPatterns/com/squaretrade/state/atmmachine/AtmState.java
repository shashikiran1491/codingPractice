package com.squaretrade.state.atmmachine;

public interface AtmState {

    void insertCard();

    void ejectCard();

    void insertPin(int pin);

    void requestCash(int cash);

}
