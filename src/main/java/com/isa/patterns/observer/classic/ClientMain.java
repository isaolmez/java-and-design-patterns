package com.isa.patterns.observer.classic;

import java.util.Random;

public class ClientMain {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditions currentConditions = new CurrentConditions();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        StatisticsDisplay secondStaticsDisplay = new StatisticsDisplay();

        weatherStation.registerObserver(currentConditions);
        weatherStation.registerObserver(forecastDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.removeObserver(secondStaticsDisplay);

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            weatherStation.setMeasurements(random.nextFloat(), random.nextFloat(), random.nextFloat());
            System.out.println("***************************************");
        }
    }
}
