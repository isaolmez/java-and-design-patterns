package com.isa.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Waitress {

    List<Menu<MenuItem>> menus;

    public Waitress() {
        menus = new ArrayList<>();
    }

    public void addMenu(Menu<MenuItem> menu) {
        menus.add(menu);
    }

    public void printMenu() {
        for (Menu<MenuItem> menu : menus) {
            print(menu);
        }
    }

    private void print(Menu<MenuItem> menu) {
        Iterator<MenuItem> iter = menu.createIterator();
        while (iter.hasNext()) {
            MenuItem menuItem = iter.next();
            System.out.println(menuItem);
        }
    }
}
