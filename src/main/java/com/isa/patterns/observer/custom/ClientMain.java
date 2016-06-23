package com.isa.patterns.observer.custom;

import java.util.Random;

public class ClientMain {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditions c = new CurrentConditions();
		ForecastDisplay f = new ForecastDisplay();
		StatisticsDisplay s = new StatisticsDisplay();
		StatisticsDisplay s2 = new StatisticsDisplay();
		weatherData.registerObserver(c);
		weatherData.registerObserver(f);
		weatherData.registerObserver(s);
		weatherData.removeObserver(s2);

		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			weatherData.setMeasurements(random.nextFloat(), random.nextFloat(), random.nextFloat());
			System.out.println("***************************************");
		}

	}
}
