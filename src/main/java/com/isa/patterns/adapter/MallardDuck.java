package com.isa.patterns.adapter;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack quack...");
    }

    @Override
    public void fly() {
        System.out.println("Fly...");
    }
}
