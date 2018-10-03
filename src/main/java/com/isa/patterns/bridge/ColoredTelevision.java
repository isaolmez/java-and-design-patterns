package com.isa.patterns.bridge;

public class ColoredTelevision implements Television {

    @Override
    public boolean on() {
        System.out.println("Colored television on()");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("Colored television off()");
        return true;
    }

    @Override
    public void tuneVolume(int newValue) {
        System.out.printf("Satellite television tuneVolume() %d\n", newValue);
    }
}
