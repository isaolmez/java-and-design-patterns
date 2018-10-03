package com.isa.patterns.builder.cascaded;

import com.isa.patterns.builder.inherited.ProfessionBuilders;

public class ClientMain {

    public static void main(String[] args) {

        Person person =
                new Person.Builder("John", "Doe")
                        .age(20)
                        .profession(
                                ProfessionBuilders.newPilot().name("Airbus Pilot").build())
                        .add("Fishing")
                        .add("Games")
                        .add("Football")
                        .build();
        System.out.println(person);

        Person person2 =
                Person.of("Jane", "Doe")
                      .age(20)
                      .profession(
                              ProfessionBuilders.newEngineer().name("Test Engineer").build())
                      .add("Fishing")
                      .add("Games")
                      .add("Football")
                      .build();
        System.out.println(person2);
    }
}
