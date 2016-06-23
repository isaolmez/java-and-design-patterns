package com.isa.patterns.decorator.alternative;

/** 
 * This class takes some of the flexibility and gives concrete implementations to its subclasses. In this case, it works. 
 * But there can be cases that this is too restrictive and abstract classes should be used.
 * */
public class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	protected double cost;

	public String getDescription() {
		return String.format("%s, %s", beverage.getDescription(), this.description);
	}

	public double cost() {
		return cost + beverage.cost();
	}
}
