package com.isa.patterns.iterator;

public class ClientMain {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress();
        waitress.addMenu(dinerMenu);
        waitress.addMenu(pancakeMenu);
        waitress.printMenu();
    }
}
