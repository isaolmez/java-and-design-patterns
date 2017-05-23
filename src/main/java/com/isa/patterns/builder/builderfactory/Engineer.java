package com.isa.patterns.builder.builderfactory;

import java.util.List;

public class Engineer extends Profession {
  public Engineer(String name, double salary, boolean isPrivateSector, List<String> duties) {
    super(name, salary, isPrivateSector, duties);
  }

  @Override
  public void work() {
    System.out.println("Implementing and testing...");
  }
}
