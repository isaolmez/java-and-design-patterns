package com.isa.patterns.factory.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore() {
        this.ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(
                    "Chicago Style Cheese Pizza"); // If this does not vary by PizzaStore implementations, createPizza could be defined in super class.
        } else if (type.equals("clam")) {
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("Chicago Style Clams Pizza");
        }

        return pizza;
    }
}
