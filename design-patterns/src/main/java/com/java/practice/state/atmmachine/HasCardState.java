package com.java.practice.state.atmmachine;

public class HasCardState implements AtmState {

    ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can only insert one card at a time");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("You entered the correct PIN");
        atmMachine.setAtmState(atmMachine.getHasPinState());
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("You have not entered your PIN");
    }
}
