package com.isa.patterns.compositeiterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private double price;
    private boolean isVegetarian;

    public MenuItem(String name, String description, double price, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void print() {
        System.out.println(
                "MenuItem [name="
                        + name
                        + ", description="
                        + description
                        + ", price="
                        + price
                        + ", isVegetarian="
                        + isVegetarian
                        + "]");
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
