package com.isa.patterns.proxy.protecting;

public class ReadOnlyUserProxy implements User{
    private final User user;

    public ReadOnlyUserProxy(User user){
        this.user = user;
    }

    @Override
    public void login() {
        System.out.println("Not allowed");
    }

    @Override
    public void read() {
        user.read();
    }

    @Override
    public void update() {
        System.out.println("Not allowed");
    }

    @Override
    public void delete() {
        System.out.println("Not allowed");
    }
}
