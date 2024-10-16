package com.java.practice.command.commands;

import com.java.practice.command.device.Device;

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
