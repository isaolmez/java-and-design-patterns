package com.isa.patterns.builder;

public class ClientMain {

    public static void main(String[] args){
        Person person = new Person.Builder("name", "lastName")
                .age(20)
                .profession("Engineer")
                .add("Fishing")
                .add("Games")
                .add("Football")
                .build();
        System.out.println(person);
    }
}
