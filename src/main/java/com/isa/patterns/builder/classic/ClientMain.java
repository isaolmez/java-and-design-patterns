package com.isa.patterns.builder.classic;

public class ClientMain {

    public static void main(String[] args) {
        Person person =
                new Person.Builder("John", "Doe")
                        .age(20)
                        .profession("Engineer")
                        .add("Fishing")
                        .add("Games")
                        .add("Football")
                        .build();
        System.out.println(person);

        Person person2 =
                Person.of("Jane", "Doe")
                      .age(20)
                      .profession("Doctor")
                      .add("Fishing")
                      .add("Games")
                      .add("Football")
                      .build();
        System.out.println(person2);
    }
}
