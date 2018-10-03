package com.isa.patterns.singleton.lazy.v1;

/**
 * Synchronized implementation. Lazy init. Thread-safe
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
