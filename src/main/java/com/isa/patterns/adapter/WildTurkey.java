package com.isa.patterns.adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble...");
    }

    @Override
    public void fly() {
        System.out.println("Short distance flight...");
    }
}
