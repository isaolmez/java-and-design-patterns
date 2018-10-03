package com.isa.patterns.factory.abstractfactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough getDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce getSauce() {
        return new MarinaSauce();
    }

    @Override
    public Cheese getCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams getClams() {
        return new FrozenClams();
    }
}
