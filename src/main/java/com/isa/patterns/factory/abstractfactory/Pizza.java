package com.isa.patterns.factory.abstractfactory;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Clams clams;
    protected Cheese cheese;

    // This can be concrete, if it is same for all subclasses
    public abstract void prepare();

    public void bake() {
        System.out.println("Baking...");
    }

    public void cut() {
        System.out.println("Cutting...");
    }

    public void box() {
        System.out.println("Boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
