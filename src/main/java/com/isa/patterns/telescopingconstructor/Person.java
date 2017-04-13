package com.isa.patterns.telescopingconstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private final String name;

    private final String lastName;

    private final int age;

    private final String profession;

    private final List<String> hobbies;

    public Person(String name, String lastName) {
        this(name, lastName, 0);
    }

    public Person(String name, String lastName, int age) {
        this(name, lastName, age, null);
    }

    public Person(String name, String lastName, int age, String profession) {
        this(name, lastName, age, profession, null);
    }

    public Person(String name, String lastName, int age, String profession, List<String> hobbies) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.hobbies = hobbies == null ? new ArrayList<>() : new ArrayList<>(hobbies);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
