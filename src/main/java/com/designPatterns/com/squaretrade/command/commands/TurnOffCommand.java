package com.squaretrade.command.commands;

import com.squaretrade.command.device.Device;

public class TurnOffCommand implements Command {

    Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
