package com.squaretrade.state.atmmachine;

public class TestAtmMachine {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.requestCash(1000);
        atmMachine.insertCard();

        atmMachine.insertPin(123);

        atmMachine.requestCash(1000);

        atmMachine.requestCash(1000);

    }

}
