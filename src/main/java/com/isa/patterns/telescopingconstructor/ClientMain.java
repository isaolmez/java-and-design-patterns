package com.isa.patterns.telescopingconstructor;

import java.util.Arrays;

public class ClientMain {

    public static void main(String[] args) {
        Person person = new Person("name", "lastName");
        System.out.println(person);

        person = new Person("name", "lastName", 20);
        System.out.println(person);

        person = new Person("name", "lastName", 20, "Engineer");
        System.out.println(person);

        person = new Person("name", "lastName", 20, "Engineer", Arrays.asList("Fishing"));
        System.out.println(person);
    }
}
