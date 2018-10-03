package com.isa.patterns.iterator;

import java.util.LinkedList;

public class DinerMenu implements Menu<MenuItem> {

    private LinkedList<MenuItem> menu;

    public DinerMenu() {
        menu = new LinkedList<>();
        this.addItem("HotDog", "A hot dog", false, 1.2);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menu.add(new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menu);
    }
}
