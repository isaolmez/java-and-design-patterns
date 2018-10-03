package com.isa.patterns.command;

public class ClientMain {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);
        LightOffCommand offCommand = new LightOffCommand(light);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, onCommand, offCommand);
        System.out.println(remote);
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.undoButtonWasPushed();
        System.out.println(remote);
    }
}
