package com.isa.patterns.factory.abstractfactory;

public class ClamsPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public ClamsPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        // If all pizza uses same number of ingredients, this could be implemented in super class. If so, no need to define as abstract
        System.out.println("Preparing..." + name);
        this.sauce = ingredientFactory.getSauce();
        this.clams = ingredientFactory.getClams();
        this.cheese = ingredientFactory.getCheese();
        this.dough = ingredientFactory.getDough();
    }
}
