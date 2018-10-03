package com.isa.patterns.proxy.lazyloading;

public class ExpensiveServiceImpl implements ExpensiveService {

    // Expensive initialization
    public ExpensiveServiceImpl() {
        System.out.println("Expensive initialization process.");
    }

    @Override
    public void create() {
        System.out.println("Creating");
    }
}
