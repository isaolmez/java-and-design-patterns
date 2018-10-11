package com.isa.patterns.observer.classic;

public class StatisticsDisplay implements Observer {

    public void update(float temp, float humidity, float pressure) {
        // Process the change
        System.out.println(String.format("%f\t%f\t%f", temp, humidity, pressure));
    }
}
