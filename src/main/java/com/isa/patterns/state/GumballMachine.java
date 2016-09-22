package com.isa.patterns.state;

public class GumballMachine {
	private State state;
	private int gumballCount;
	private State noQuarterState;
	private State soldOutState;
	private State soldState;
	private State hasQuarterState;

	public GumballMachine(int gumballCount) {
		this.state = new NoQuarterState(this);
		this.gumballCount = gumballCount;
		this.noQuarterState = new NoQuarterState(this);
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.hasQuarterState = new HasQuarterState(this);
		System.out.println(state);
		if (gumballCount > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall() {
		System.out.println("Releasing the ball");
		if (gumballCount != 0) {
			gumballCount--;
		}
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getGumballCount() {
		return gumballCount;
	}

	public void setGumballCount(int gumballCount) {
		this.gumballCount = gumballCount;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}
}
