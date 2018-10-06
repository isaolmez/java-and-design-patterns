package com.isa.patterns.strategy.main;

import com.isa.patterns.strategy.algorithms.FlyNoWay;
import com.isa.patterns.strategy.algorithms.Flyable;
import com.isa.patterns.strategy.algorithms.MuteQuack;
import com.isa.patterns.strategy.algorithms.Quackable;

public class Duck {

    private Flyable flyBehavior;
    private Quackable quackBehavior;

    public Duck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void setFlyBehavior(Flyable flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(Quackable quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
