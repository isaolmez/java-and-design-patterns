package com.isa.patterns.compositeiterator;

import java.util.Iterator;

public class Waitress {

    private MenuComponent topMenu;

    public Waitress(MenuComponent topMenu) {
        this.topMenu = topMenu;
    }

    public void print() {
        Iterator<MenuComponent> iter = topMenu.createIterator();
        while (iter.hasNext()) {
            iter.next().print();
        }
    }
}
