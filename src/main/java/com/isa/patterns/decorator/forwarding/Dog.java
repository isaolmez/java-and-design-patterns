package com.isa.patterns.decorator.forwarding;

public class Dog implements Animal{

    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }

    @Override
    public void run() {
        System.out.println("Dog is running.");
    }

    @Override
    public void eat(String meal) {
        System.out.println("Dog is eating.");
    }

    @Override
    public Animal breed(Animal animal) {
        System.out.println("Dog is breeding.");
        return new Dog();
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
