package com.isa.patterns.strategy.algorithms;

public class FlyNoWay implements Flyable {

    public void fly() {
        System.out.println("I cannot fly!");
    }
}
