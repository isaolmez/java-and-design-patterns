package com.isa.patterns.observer.jdk;

import java.util.Random;

public class ClientMain {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditions currentConditions = new CurrentConditions();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherStation.addObserver(currentConditions);
        weatherStation.addObserver(forecastDisplay);
        weatherStation.addObserver(statisticsDisplay);

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            weatherStation.setMeasurements(random.nextFloat(), random.nextFloat(), random.nextFloat());
            System.out.println("***************************************");
        }
    }
}
