package com.isa.patterns.composite;

public class Waitress {

    private MenuComponent topMenu;

    public Waitress(MenuComponent topMenu) {
        this.topMenu = topMenu;
    }

    public void print() {
        topMenu.print();
    }
}
