package com.isa.patterns.singleton.lazy.v1;

/**
 * Synchronized implementation. Lazy init. Thread-safe
 */
public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

}
