package com.isa.patterns.singleton.lazy.v3;

/**
 * Holder-class. Lazy init. Thread-safe
 */
public class Singleton {

    private static class SingletonHolder {

        static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
        if (SingletonHolder.INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
