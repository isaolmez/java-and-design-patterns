package com.isa.patterns.builder.inherited;

public interface ProfessionBuilder<T extends Profession> {
  ProfessionBuilder<T> name(String name);

  ProfessionBuilder<T> salary(double salary);

  ProfessionBuilder<T> privateSector(boolean isPrivateSector);

  ProfessionBuilder<T> duty(String duty);

  T build();
}
