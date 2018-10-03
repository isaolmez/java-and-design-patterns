package com.isa.patterns.bridge;

public class ConcreteRemoteControl extends RemoteControl {

    private int volume;

    public ConcreteRemoteControl(Television television) {
        super(television);
    }

    @Override
    public boolean on() {
        return television.on();
    }

    @Override
    public boolean off() {
        return television.off();
    }

    @Override
    public void updateVolume(int newValue) {
        volume = newValue;
        television.tuneVolume(newValue);
    }

    // Additional methods
    public void increaseVolume() {
        updateVolume(volume + 1);
    }

    public void decreaseVolume() {
        updateVolume(volume - 1);
    }
}
