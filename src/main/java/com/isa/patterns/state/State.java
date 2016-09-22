package com.isa.patterns.state;

public interface State {
	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();
}
