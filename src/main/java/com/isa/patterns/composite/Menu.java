package com.isa.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuItems;
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.menuItems = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        this.menuItems.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        this.menuItems.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return this.menuItems.get(i);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print() {
        System.out.printf("\n%s, %s\n-----------\n", getName(), getDescription());
        for (MenuComponent menuComponent : menuItems) {
            menuComponent.print();
        }
    }
}
