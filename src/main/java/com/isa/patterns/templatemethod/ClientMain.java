package com.isa.patterns.templatemethod;

public class ClientMain {

    public static void main(String[] args) {
        System.out.println("---- Coffee");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("---- Tea");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
