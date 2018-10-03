package com.isa.patterns.decorator.alternative;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.description = "Mocha";
        this.cost = 0.20;
        this.beverage = beverage;
    }
}
