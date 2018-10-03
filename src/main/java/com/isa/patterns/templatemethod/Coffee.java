package com.isa.patterns.templatemethod;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping coffee");
    }

    @Override
    public void addContiments() {
        System.out.println("Adding sugar and milk");
    }
}
