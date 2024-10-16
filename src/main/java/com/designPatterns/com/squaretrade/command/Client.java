package com.squaretrade.command;

import com.squaretrade.command.commands.TurnOnCommand;
import com.squaretrade.command.device.Television;

public class Client {

    public static void main(String[] args) {

        Television tv = new Television();
        TurnOnCommand command = new TurnOnCommand(tv);

        RemoteControl rc= new RemoteControl(command);
        rc.pressButton();

    }
}
