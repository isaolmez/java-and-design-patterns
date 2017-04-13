package com.isa.patterns.singleton.lazy.v3;

/**
 * Holder-class. Lazy init. Thread-safe
 */
public class Singleton {
	private static class SingletonHolder {
		static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
