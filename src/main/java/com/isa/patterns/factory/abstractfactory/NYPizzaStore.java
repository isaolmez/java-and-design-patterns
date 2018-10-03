package com.isa.patterns.factory.abstractfactory;

public class NYPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore() {
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(
                    "NY Style Cheese Pizza"); // If this does not vary by PizzaStore implementations, createPizza could be defined in super class.
        } else if (type.equals("clam")) {
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("NY Style Clams Pizza");
        }

        return pizza;
    }
}
