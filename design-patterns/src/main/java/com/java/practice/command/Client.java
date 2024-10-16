package com.java.practice.command;

import com.java.practice.command.commands.TurnOnCommand;
import com.java.practice.command.device.Television;

public class Client {

    public static void main(String[] args) {

        Television tv = new Television();
        TurnOnCommand command = new TurnOnCommand(tv);

        RemoteControl rc= new RemoteControl(command);
        rc.pressButton();

    }
}
