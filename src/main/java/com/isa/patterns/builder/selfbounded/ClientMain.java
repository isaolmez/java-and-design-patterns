package com.isa.patterns.builder.selfbounded;

public class ClientMain {

    public static void main(String[] args) {
        Engineer engineer = ProfessionBuilders.newEngineer()
                                              .name("Engineer")
                                              .salary(100)
                                              .duty("Code")
                                              .tools("Compiler")
                                              .build();
        System.out.println(engineer);

        Pilot pilot = ProfessionBuilders.newPilot()
                                        .name("Pilot")
                                        .salary(200)
                                        .duty("Fly")
                                        .language("English")
                                        .build();
        System.out.println(pilot);
    }
}
