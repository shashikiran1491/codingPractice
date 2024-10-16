package com.squaretrade.command.device;

public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turn ON radio");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn OFF radio");
    }
}
