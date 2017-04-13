package com.isa.patterns.proxy.delaying;

public class ExpensiveServiceImpl implements ExpensiveService {
    @Override
    public void create() {
        // Expensive process
        System.out.println("Expensive creation process.");
    }
}
