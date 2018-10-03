package com.isa.patterns.strategy.algorithms;

public class MuteQuack implements Quackable {

    public void quack() {
        System.out.println("Sshhh!");
    }
}
