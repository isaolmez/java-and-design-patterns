package com.isa.patterns.builder.inherited;

public class ClientMain {

  public static void main(String[] args) {
    Engineer engineer =
        ProfessionBuilders.newEngineer()
            .name("Engineer")
            .salary(100)
            .privateSector(true)
            .duty("Code")
            .build();
    System.out.println(engineer);

    Pilot pilot =
        ProfessionBuilders.newPilot()
            .name("Pilot")
            .salary(100)
            .privateSector(true)
            .duty("Fly")
            .build();
    System.out.println(pilot);
  }
}
