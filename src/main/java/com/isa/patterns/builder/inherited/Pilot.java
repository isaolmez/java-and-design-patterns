package com.isa.patterns.builder.inherited;

import java.util.List;

public class Pilot extends Profession {

    public Pilot(String name, double salary, boolean isPrivateSector, List<String> duties) {
        super(name, salary, duties);
    }

    @Override
    public void work() {
        System.out.println("Flying the plane...");
    }
}
