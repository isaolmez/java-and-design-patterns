package com.isa.patterns.bridge;

public abstract class RemoteControl {

    protected Television television;

    public RemoteControl(Television television) {
        this.television = television;
    }

    public abstract boolean on();

    public abstract boolean off();

    public abstract void updateVolume(int newValue);
}
