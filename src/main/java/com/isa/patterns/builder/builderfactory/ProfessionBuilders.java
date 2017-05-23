package com.isa.patterns.builder.builderfactory;

import java.util.ArrayList;
import java.util.List;

public class ProfessionBuilders {

  /** Static factory methods */
  public static EngineerBuilder newEngineer() {
    return new EngineerBuilder();
  }

  public static PilotBuilder newPilot() {
    return new PilotBuilder();
  }

  /** Pilot Builder */
  public static class PilotBuilder extends AbstractProfessionBuilder<Pilot, PilotBuilder> {

    private PlaneType planeType;

    public PilotBuilder planeType(PlaneType planeType) {
      this.planeType = planeType;
      return this;
    }

    @Override
    protected Pilot internalBuild() {
      return new Pilot(this.name, this.salary, this.isPrivateSector, this.duties, this.planeType);
    }
  }

  /** Engineer Builder */
  public static class EngineerBuilder extends AbstractProfessionBuilder<Engineer, EngineerBuilder> {

    @Override
    protected Engineer internalBuild() {
      return new Engineer(this.name, this.salary, this.isPrivateSector, this.duties);
    }
  }

  abstract static class AbstractProfessionBuilder<
          T extends Profession, B extends AbstractProfessionBuilder<T, B>>
      implements ProfessionBuilder<T, B> {

    String name;

    double salary;

    boolean isPrivateSector;

    List<String> duties = new ArrayList<>();

    @Override
    public B name(String name) {
      if (name == null || name.isEmpty()) {
        throw new IllegalArgumentException("Name cannot be empty");
      }

      this.name = name;
      return (B) this;
    }

    @Override
    public B salary(double salary) {
      if (salary < 0) {
        throw new IllegalArgumentException("Salary cannot be smaller than 0");
      }

      this.salary = salary;
      return (B) this;
    }

    @Override
    public B privateSector(boolean isPrivateSector) {
      this.isPrivateSector = isPrivateSector;
      return (B) this;
    }

    @Override
    public B duty(String duty) {
      if (duty == null || duty.isEmpty()) {
        throw new IllegalArgumentException("Duty cannot be empty");
      }

      duties.add(duty);
      return (B) this;
    }

    public T build() {
      return internalBuild();
    }

    protected abstract T internalBuild();
  }
}
