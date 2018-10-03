package com.isa.patterns.bridge;

public class ClientMain {

    public static void main(String[] args) {
        ConcreteRemoteControl remoteControl = new ConcreteRemoteControl(new ColoredTelevision());
        remoteControl.on();
        remoteControl.updateVolume(123);
        remoteControl.increaseVolume();
        remoteControl.increaseVolume();
        remoteControl.increaseVolume();
        remoteControl.increaseVolume();
        remoteControl.off();
        remoteControl = new ConcreteRemoteControl(new SatelliteTelevision());
        remoteControl.on();
        remoteControl.updateVolume(123);
        remoteControl.increaseVolume();
        remoteControl.increaseVolume();
        remoteControl.increaseVolume();
        remoteControl.increaseVolume();
        remoteControl.off();
    }
}
