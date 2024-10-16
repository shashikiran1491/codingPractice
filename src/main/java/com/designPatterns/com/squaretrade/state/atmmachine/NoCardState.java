package com.squaretrade.state.atmmachine;

public class NoCardState implements AtmState {

    ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter your pin");
        atmMachine.setAtmState(atmMachine.getHasCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("You didn't enter a card");

    }

    @Override
    public void insertPin(int pin) {
        System.out.println("You have not entered your card");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("You have not entered your card");

    }
}
