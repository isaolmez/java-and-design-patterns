package com.isa.patterns.singleton.eager.v2;

/**
 * Eager initialization. Static factory method. Thread-safe
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
