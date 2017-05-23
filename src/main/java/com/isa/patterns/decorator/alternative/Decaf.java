package com.isa.patterns.decorator.alternative;

public class Decaf extends Beverage {

  public Decaf() {
    this.description = "Decaf";
  }

  @Override
  public double cost() {
    return 2;
  }
}
