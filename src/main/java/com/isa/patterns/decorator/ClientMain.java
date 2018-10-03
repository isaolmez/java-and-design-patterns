package com.isa.patterns.decorator;

public class ClientMain {

    public static void main(String[] args) {
        Beverage b = new Mocha(new Mocha(new Whip(new HouseBlend())));
        System.out.println(b.getDescription());
        System.out.println(b.cost());

        b = new Espresso();
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
