package com.java.practice.command;

import com.java.practice.command.commands.Command;

public class RemoteControl {

    Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
