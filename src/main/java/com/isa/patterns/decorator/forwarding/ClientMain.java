package com.isa.patterns.decorator.forwarding;

public class ClientMain {

    public static void main(String[] args) {
        Animal dogDecorator = new BreedingAwareDecorator(new Dog());
        dogDecorator.breed(new Dog());
        dogDecorator.breed(new Dog());
        dogDecorator.breed(new Dog());
    }
}
