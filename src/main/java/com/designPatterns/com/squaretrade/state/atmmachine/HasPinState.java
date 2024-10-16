package com.squaretrade.state.atmmachine;

public class HasPinState implements AtmState {

    ATMMachine atmMachine;

    public HasPinState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You already entered a card");

    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pin) {
        System.out.println("You already entered a PIN");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println(cashToWithdraw + " is provided by the machine");
        atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
        System.out.println("Your card is ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }
}
