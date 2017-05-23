package com.isa.patterns.proxy.dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;

public class ClientMain {
  public static void main(String[] args) {
    User user = new SimpleUser();
    User readOnlyUser = getReadOnlyProxy(user);
    User adminUser = getAdminProxy(user);
    User genericUser = getGenericProxy(user);

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

    System.out.println("---Generic user");
    genericUser.login();
    genericUser.read();
    genericUser.update();
    genericUser.delete();
  }

  private static User getReadOnlyProxy(User user) {
    return (User)
        Proxy.newProxyInstance(
            user.getClass().getClassLoader(),
            user.getClass().getInterfaces(),
            new ReadOnlyInvocationHandler(user));
  }

  private static User getAdminProxy(User user) {
    return (User)
        Proxy.newProxyInstance(
            user.getClass().getClassLoader(),
            user.getClass().getInterfaces(),
            new AdminInvocationHandler(user));
  }

  private static User getGenericProxy(User user) {
    Set<String> permissions = new HashSet<>();
    permissions.add("read");
    permissions.add("update");
    return (User)
        Proxy.newProxyInstance(
            user.getClass().getClassLoader(),
            user.getClass().getInterfaces(),
            new GenericInvocationHandler(user, permissions));
  }
}
