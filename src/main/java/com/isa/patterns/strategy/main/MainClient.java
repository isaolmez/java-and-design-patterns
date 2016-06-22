package com.isa.patterns.strategy.main;

import com.isa.patterns.strategy.algorithms.FlyWithWings;
import com.isa.patterns.strategy.algorithms.Squeak;

public class MainClient {
	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		md.performQuack();
		md.performFly();
		md.setFlyBehavior(new FlyWithWings());
		md.setQuackBehavior(new Squeak());
		md.performQuack();
		md.performFly();
	}
}
