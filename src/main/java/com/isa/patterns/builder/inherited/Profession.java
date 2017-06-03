package com.isa.patterns.builder.inherited;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Profession {

  private final String name;

  private final double salary;

  private final boolean isPrivateSector;

  private final List<String> duties;

  public Profession(String name, double salary, boolean isPrivateSector, List<String> duties) {
    this.name = name;
    this.salary = salary;
    this.isPrivateSector = isPrivateSector;
    this.duties = duties == null ? new ArrayList<>() : new ArrayList<>(duties);
  }

  public abstract void work();

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public boolean isPrivateSector() {
    return isPrivateSector;
  }

  public List<String> getDuties() {
    return Collections.unmodifiableList(duties);
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this).add("name", name).add("Salary", salary)
        .add("Private Sector", isPrivateSector).add("Duties", duties).toString();
  }
}
