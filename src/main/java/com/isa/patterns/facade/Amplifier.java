package com.isa.patterns.facade;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier on...");
    }

    public void setVolume(int volume) {
        System.out.println("Volume: " + volume);
    }
}
