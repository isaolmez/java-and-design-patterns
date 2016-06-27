package com.isa.patterns.singleton.v3;

/**
 *  Double-checked locking, Thread-safe
 */
public class Singleton {
	private static Singleton instance;
	
	private Singleton(){	
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();	
				}
			}
		}
		
		return instance;
	}
	
}
