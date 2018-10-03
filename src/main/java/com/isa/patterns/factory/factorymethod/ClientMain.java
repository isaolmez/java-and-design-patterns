package com.isa.patterns.factory.factorymethod;

public class ClientMain {

    public static void main(String[] args) {
        System.out.println("###NY Pizza Store###");
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");
        System.out.println("*****************************");
        store.orderPizza("clam");

        System.out.println("\n###Chicago Pizza Store###");
        store = new ChicagoPizzaStore();
        store.orderPizza("cheese");
        System.out.println("*****************************");
        store.orderPizza("clam");
    }
}
