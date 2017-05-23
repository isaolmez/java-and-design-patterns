package com.isa.patterns.proxy.protecting;

public class ClientMain {
  public static void main(String[] args) {
    User user = new SimpleUser();
    User readOnlyUser = new ReadOnlyUserProxy(user);
    User adminUser = new AdminUserProxy(user);

    System.out.println("---Read only user");
    readOnlyUser.login();
    readOnlyUser.read();
    readOnlyUser.update();
    readOnlyUser.delete();

    System.out.println("---Admin user");
    adminUser.login();
    adminUser.read();
    adminUser.update();
    adminUser.delete();
  }
}
