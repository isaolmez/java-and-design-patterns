package com.isa.patterns.strategy.main;

import com.isa.patterns.strategy.algorithms.FlyWithWings;
import com.isa.patterns.strategy.algorithms.Squeak;

public class MainClient {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.performQuack();
        duck.performFly();

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.performFly();
    }
}
