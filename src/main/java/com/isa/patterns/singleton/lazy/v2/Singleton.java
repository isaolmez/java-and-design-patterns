package com.isa.patterns.singleton.lazy.v2;

/**
 * Double-checked locking. Lazy init. Thread-safe
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
