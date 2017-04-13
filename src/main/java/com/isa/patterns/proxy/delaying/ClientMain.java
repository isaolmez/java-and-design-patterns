package com.isa.patterns.proxy.delaying;

public class ClientMain {
	public static void main(String[] args) {
		ExpensiveService delayingProxy = new DelayingServiceProxy();
		delayingProxy.create();
	}
}
