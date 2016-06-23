package com.isa.patterns.decorator.alternative;

public class SteamedMilk extends CondimentDecorator {
	public SteamedMilk(Beverage beverage) {
		this.description = "Steamed Milk";
		this.cost = 0.1;
		this.beverage = beverage;
	}
}
