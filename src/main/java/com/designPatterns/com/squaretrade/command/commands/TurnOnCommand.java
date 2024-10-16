package com.squaretrade.command.commands;

import com.squaretrade.command.device.Device;

public class TurnOnCommand implements Command{
    Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
