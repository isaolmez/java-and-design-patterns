package com.isa.patterns.proxy.dynamicproxy;

public class SimpleUser implements User {

  @Override
  public void login() {
    System.out.println("Logged in...");
  }

  @Override
  public void read() {
    System.out.println("Read the value...");
  }

  @Override
  public void update() {
    System.out.println("Edited the value...");
  }

  @Override
  public void delete() {
    System.out.println("Deleted the value...");
  }
}
