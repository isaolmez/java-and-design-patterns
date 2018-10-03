package com.isa.patterns.bridge;

public class SatelliteTelevision implements Television {

    @Override
    public boolean on() {
        System.out.println("Satellite television on()");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("Satellite television off()");
        return true;
    }

    @Override
    public void tuneVolume(int newValue) {
        System.out.printf("Satellite television tuneVolume() %d\n", newValue);
    }
}
