package com.java.practice.state.vendingMachine;

public class VendingMachineContext {

    VendingMachineState state;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
