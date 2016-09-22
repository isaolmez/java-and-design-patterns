package com.isa.patterns.state;

public class TestClient {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(10);
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
	}
}
