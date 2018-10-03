package com.isa.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu<MenuItem> {

    private List<MenuItem> menu;

    public PancakeHouseMenu() {
        menu = new ArrayList<>();
        this.addItem("Cake", "A protecting cake", false, 2.2);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menu.add(new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseIterator(menu);
    }
}
