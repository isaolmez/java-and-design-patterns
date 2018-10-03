package com.isa.patterns.factory.simplefactory;

public class ClientMain {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("cheese");
        System.out.println("*****************************");
        store.orderPizza("clam");
    }
}
