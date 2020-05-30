package com.isa.patterns.observer.classic;

import java.util.Random;

public class ClientMain {

    public static void main(String[] args) {
        final WeatherStation weatherStation = new WeatherStation();

        final CurrentConditions currentConditions = new CurrentConditions();
        weatherStation.registerObserver(currentConditions);
        final ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherStation.registerObserver(forecastDisplay);
        final StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherStation.registerObserver(statisticsDisplay);

        final Random random = new Random();
        for (int i = 0; i < 5; i++) {
            weatherStation.setMeasurements(random.nextFloat(), random.nextFloat(), random.nextFloat());
            System.out.println("***************************************");
        }
    }
}
