package com.isa.patterns.templatemethod;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        preBoil();
        boilWater();
        postBoil();
        preBrew();
        brew();
        postBrew();
        pourInCup();
        addContiments();
    }

    public abstract void brew();

    public abstract void addContiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring in...");
    }

    /**
     * Some hooks
     */
    public void preBoil() {
    }

    public void postBoil() {
    }

    public void preBrew() {
    }

    public void postBrew() {
    }
}
