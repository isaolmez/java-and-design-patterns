package com.isa.patterns.proxy.securing;

public class DataServiceImpl implements DataService {

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
