package com.isa.patterns.state;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There are no gumballs left");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There are no gumballs left");
    }

    @Override
    public void turnCrank() {
        System.out.println("There are no gumballs left");
    }

    @Override
    public void dispense() {
        System.out.println("There are no gumballs left");
    }

    @Override
    public String toString() {
        return "SoldOutState: No gumballs left";
    }
}
