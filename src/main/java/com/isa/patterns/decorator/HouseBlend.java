package com.isa.patterns.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
