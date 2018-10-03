package com.isa.patterns.factory.abstractfactory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // This can be concrete, if it is same for all subclasses
    public abstract Pizza createPizza(String type);
}
