package com.java.practice.command.commands;

import com.java.practice.command.device.Device;

public class TurnOnCommand implements Command {
    Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
