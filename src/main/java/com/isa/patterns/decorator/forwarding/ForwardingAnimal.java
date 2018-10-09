package com.isa.patterns.decorator.forwarding;

public abstract class ForwardingAnimal implements Animal {

    private final Animal delegate;

    public ForwardingAnimal(Animal delegate) {
        this.delegate = delegate;
    }

    @Override
    public void walk() {
        delegate.walk();
    }

    @Override
    public void run() {
        delegate.run();
    }

    @Override
    public void eat(String meal) {
        delegate.eat(meal);
    }

    @Override
    public Animal breed(Animal animal) {
        return animal.breed(animal);
    }

    @Override
    public void sleep() {
        delegate.sleep();
    }
}
