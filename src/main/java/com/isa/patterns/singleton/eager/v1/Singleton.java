package com.isa.patterns.singleton.eager.v1;

/**
 *  Eager initialization. Public member. Thread-safe
 */
public class Singleton {
	public static final Singleton INSTANCE = new Singleton();
	
	private Singleton(){	
	}
}
