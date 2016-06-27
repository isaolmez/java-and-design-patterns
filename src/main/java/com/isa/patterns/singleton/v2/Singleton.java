package com.isa.patterns.singleton.v2;

/**
 *  Eager initialization, Thread-safe
 */
public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton(){	
	}
	
	public static Singleton getInstance(){
		return instance;
	}
	
}
