package com.isa.patterns.builder.cascaded;

import com.google.common.base.Objects;
import com.isa.patterns.builder.inherited.Profession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

  private final String name;

  private final String lastName;

  private final int age;

  private final Profession profession;

  private final List<String> hobbies;

  private Person(
      String name, String lastName, int age, Profession profession, List<String> hobbies) {
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

  public Profession getProfession() {
    return profession;
  }

  public List<String> getHobbies() {
    return Collections.unmodifiableList(hobbies);
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this).add("Name", name).add("Last Name", lastName)
        .add("Profession", profession.toString()).toString();
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

    private Profession profession;

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

    public Builder profession(Profession profession) {
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
