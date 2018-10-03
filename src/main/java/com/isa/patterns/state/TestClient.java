package com.isa.patterns.state;

public class TestClient {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
