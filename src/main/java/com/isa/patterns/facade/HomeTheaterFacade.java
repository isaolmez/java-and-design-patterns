package com.isa.patterns.facade;

public class HomeTheaterFacade {

    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
    }

    public void watchMovie() {
        System.out.println("Preparing sub system to watch movie...");
        dvd.on();
        amp.on();
        amp.setVolume(10);
        tuner.on();
        dvd.play();
    }
}
