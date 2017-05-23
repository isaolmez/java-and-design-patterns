package com.isa.patterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AdminInvocationHandler implements InvocationHandler {

  private final User user;

  public AdminInvocationHandler(User user) {
    this.user = user;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(user, args);
  }
}
