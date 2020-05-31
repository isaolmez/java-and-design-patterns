package com.isa.patterns.decorator;

public class ClientMain {

    public static void main(String[] args) {
        final Beverage beverage = new Mocha(new Mocha(new Whip(new HouseBlend())));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        final Beverage anotherBeverage = new Espresso();
        System.out.println(anotherBeverage.getDescription());
        System.out.println(anotherBeverage.cost());
    }
}
