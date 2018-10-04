package com.isa.patterns.builder.classic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {

    private final String name;

    private final String lastName;

    private final int age;

    private final String profession;

    private final List<String> hobbies;

    private Person(
            String name, String lastName, int age, String profession, List<String> hobbies) {
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
        return new ToStringBuilder(this)
                .append("Name", name)
                .append("Last Name", lastName)
                .append("Age", age)
                .append("Profession", profession)
                .append("Hobbies", hobbies)
                .toString();
    }

    /**
     * Static factory method
     */
    public static Builder of(String name, String lastName) {
        return new Builder(name, lastName);
    }

    /**
     * BUILDER
     */
    public static class Builder {

        private final String name;

        private final String lastName;

        private int age;

        private String profession;

        private List<String> hobbies = new ArrayList<>();

        public Builder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be smaller than 0");
            }

            this.age = age;
            return this;
        }

        public Builder profession(String profession) {
            if (profession == null) {
                throw new IllegalArgumentException("Profession cannot be empty");
            }

            this.profession = profession;
            return this;
        }

        public Builder add(String hobby) {
            if (hobby == null || hobby.isEmpty()) {
                throw new IllegalArgumentException("Hobby cannot be empty");
            }

            this.hobbies.add(hobby);
            return this;
        }

        public Person build() {
            return new Person(name, lastName, age, profession, hobbies);
        }
    }
}
