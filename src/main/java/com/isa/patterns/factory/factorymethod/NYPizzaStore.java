package com.isa.patterns.factory.factorymethod;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        }

        return pizza;
    }
}
