package com.java.practice.state.vendingMachine;

public class OutOfStockState implements VendingMachineState {

    @Override
    public void handleRequest() {
        System.out.println("Out of stock state: Product unavailable. Please select another product.");
    }
}
