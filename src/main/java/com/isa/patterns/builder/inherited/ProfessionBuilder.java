package com.isa.patterns.builder.inherited;

public interface ProfessionBuilder<T extends Profession, B extends ProfessionBuilder<T, B>> {
  B name(String name);

  B salary(double salary);

  B privateSector(boolean isPrivateSector);

  B duty(String duty);

  T build();
}
