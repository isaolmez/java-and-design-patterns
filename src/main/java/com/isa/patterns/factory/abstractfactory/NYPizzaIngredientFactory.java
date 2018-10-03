package com.isa.patterns.factory.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough getDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce getSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese getCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams getClams() {
        return new FreshClams();
    }
}
