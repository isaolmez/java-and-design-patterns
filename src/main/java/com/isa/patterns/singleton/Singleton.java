package com.isa.patterns.singleton;
/**
 *	Vanilla implementation. Lazy init. Not thread-safe 
 */
public class Singleton {
	private static Singleton instance;
	
	private Singleton(){	
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}
}
