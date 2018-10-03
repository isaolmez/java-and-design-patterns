package com.isa.patterns.facade;

public class ClientMain {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd);
        homeTheater.watchMovie();
    }
}
