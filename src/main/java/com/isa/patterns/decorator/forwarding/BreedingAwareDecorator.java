package com.isa.patterns.decorator.forwarding;

import java.util.concurrent.atomic.AtomicInteger;

public class BreedingAwareDecorator extends ForwardingAnimal {

    private final AtomicInteger breedingCount = new AtomicInteger();

    public BreedingAwareDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public Animal breed(Animal animal) {
        Animal baby = super.breed(animal);
        System.out.println("Breeding count: " + breedingCount.incrementAndGet());
        return baby;
    }
}
