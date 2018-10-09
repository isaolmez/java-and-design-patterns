package com.isa.patterns.decorator.forwarding;

public interface Animal {

    void walk();

    void run();

    void eat(String meal);

    Animal breed(Animal animal);

    void sleep();
}
