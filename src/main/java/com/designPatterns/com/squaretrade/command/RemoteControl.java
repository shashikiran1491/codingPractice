package com.squaretrade.command;

import com.squaretrade.command.commands.Command;

public class RemoteControl {

    Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
