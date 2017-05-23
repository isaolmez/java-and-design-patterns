package com.isa.patterns.strategy.main;

import com.isa.patterns.strategy.algorithms.FlyNoWay;
import com.isa.patterns.strategy.algorithms.Flyable;
import com.isa.patterns.strategy.algorithms.MuteQuack;
import com.isa.patterns.strategy.algorithms.Quackable;

public class Duck {

  // Members that store changing algorithms
  private Flyable flyBehavior;
  private Quackable quackBehavior;

  public Duck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  public void swim() {
    System.out.println("Swimming...");
  }

  public void display() {
    System.out.println("Duck");
  }

  public void setFlyBehavior(Flyable flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(Quackable quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  // Call specific strategy by delegating the responsibility
  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }
}
