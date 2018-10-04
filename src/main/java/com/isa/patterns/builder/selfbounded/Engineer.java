package com.isa.patterns.builder.selfbounded;

import java.util.List;

public class Engineer extends Profession {

    private final String tools;

    public Engineer(String name, double salary, List<String> duties, String tools) {
        super(name, salary, duties);
        this.tools = tools;
    }

    @Override
    public void work() {
        System.out.println("Implementing and testing...");
    }
}
