package com.isa.patterns.factory.abstractfactory;

public interface PizzaIngredientFactory {

    Dough getDough();

    Sauce getSauce();

    Cheese getCheese();

    Clams getClams();
}
