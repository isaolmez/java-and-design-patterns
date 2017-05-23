package com.isa.patterns.builder.builderfactory;

import java.util.List;

public class Pilot extends Profession {

  private final PlaneType planeType;

  public Pilot(
      String name,
      double salary,
      boolean isPrivateSector,
      List<String> duties,
      PlaneType planeType) {
    super(name, salary, isPrivateSector, duties);
    this.planeType = planeType;
  }

  @Override
  public void work() {
    System.out.println("Flying the plane...");
  }
}
