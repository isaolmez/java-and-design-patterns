package com.isa.patterns.decorator.alternative;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    this.description = "Whip";
    this.cost = 0.15;
    this.beverage = beverage;
  }
}
