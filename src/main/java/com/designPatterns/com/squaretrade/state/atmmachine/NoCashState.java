package com.squaretrade.state.atmmachine;

public class NoCashState implements AtmState{

    ATMMachine atmMachine;


    public NoCashState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {

    }

    @Override
    public void ejectCard() {

    }

    @Override
    public void insertPin(int pin) {

    }

    @Override
    public void requestCash(int cash) {

    }
}
