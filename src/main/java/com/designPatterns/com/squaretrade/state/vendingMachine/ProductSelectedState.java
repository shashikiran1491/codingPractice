package com.squaretrade.state.vendingMachine;

public class ProductSelectedState implements VendingMachineState {

    @Override
    public void handleRequest() {
        System.out.println("Product selected state: Processing payment.");
    }
}
