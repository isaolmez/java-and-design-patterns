package com.isa.patterns.decorator.alternative;

// This is the base component class in decorator pattern
public abstract class Beverage {

  protected String description = "Unknown Beverage";

  /**
   * This will be reused for concrete components by changing only description variable, not with
   * overriding.
   */
  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
