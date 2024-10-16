package com.java.practice.state.atmmachine;

public class ATMMachine {

    AtmState hasCardState;
    AtmState noCardState;
    AtmState hasPinState;
    AtmState noCashState;

    AtmState atmState;

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    int cashInMachine = 1000;

    ATMMachine () {
        hasCardState = new HasCardState(this) ;
        noCardState = new NoCardState(this);
        hasPinState = new HasPinState(this);
        noCashState = new NoCashState(this);


        if(cashInMachine > 0) {
            atmState = new NoCardState(this);
        } else {
            atmState = new NoCashState(this);
        }
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void insertPin(int pin) {
        atmState.insertPin(pin);
    }

    public void requestCash(int cash){
        atmState.requestCash(cash);
    }


    void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }

    public AtmState getHasCardState() {
        return hasCardState;
    }

    public AtmState getNoCardState() {
        return noCardState;
    }

    public AtmState getHasPinState() {
        return hasPinState;
    }

    public AtmState getNoCashState() {
        return noCashState;
    }

}
