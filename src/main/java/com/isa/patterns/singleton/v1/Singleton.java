package com.isa.patterns.singleton.v1;
/**
 * Synchronized implementation, Thread-safe
 */
public class Singleton {
	private static Singleton instance;
	
	private Singleton(){	
	}
	
	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}
	
}
