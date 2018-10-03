package com.isa.patterns.factory.abstractfactory;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing..." + name);
        this.sauce = ingredientFactory.getSauce();
        this.clams = ingredientFactory.getClams();
        this.cheese = ingredientFactory.getCheese();
        this.dough = ingredientFactory.getDough();
    }
}
