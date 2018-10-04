package com.isa.patterns.builder.selfbounded;

import java.util.List;

public class Pilot extends Profession {

    private final String language;

    public Pilot(String name, double salary, List<String> duties, String language) {
        super(name, salary, duties);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println("Flying the plane...");
    }
}
