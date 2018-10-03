package com.isa.patterns.templatemethod;

public class Tea extends CaffeineBeverage {

    @Override
    public void preBrew() {
        System.out.println("Shake the tea");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addContiments() {
        System.out.println("Adding lemon");
    }
}
