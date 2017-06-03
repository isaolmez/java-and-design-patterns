package com.isa.patterns.proxy.protecting;

public class AdminUserProxy implements User {

  private final User user;

  public AdminUserProxy(User user) {
    this.user = user;
  }

  @Override
  public void login() {
    user.login();
  }

  @Override
  public void read() {
    user.read();
  }

  @Override
  public void update() {
    user.update();
  }

  @Override
  public void delete() {
    user.delete();
  }
}
