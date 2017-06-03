package com.isa.patterns.strategy.main;

import com.isa.patterns.strategy.algorithms.FlyNoWay;
import com.isa.patterns.strategy.algorithms.FlyWithWings;
import com.isa.patterns.strategy.algorithms.Quack;
import com.isa.patterns.strategy.algorithms.Squeak;

public class MainClient {

  public static void main(String[] args) {
    System.out.println("*** Mallard Duck");
    Duck md = new MallardDuck();
    md.performQuack();
    md.performFly();
    md.setFlyBehavior(new FlyWithWings());
    md.setQuackBehavior(new Squeak());
    md.performQuack();
    md.performFly();
    System.out.println("*** Redhead Duck");
    Duck rd = new RedheadDuck();
    rd.performQuack();
    rd.performFly();
    rd.setFlyBehavior(new FlyNoWay());
    rd.setQuackBehavior(new Quack());
    rd.performQuack();
    rd.performFly();
  }
}
