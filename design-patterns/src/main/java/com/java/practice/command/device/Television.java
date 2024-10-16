package com.java.practice.command.device;

public class Television implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turn On Television");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off Television");
    }
}
