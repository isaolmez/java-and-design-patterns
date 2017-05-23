package com.isa.patterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    if (arg != null) { // PUSH Style
      System.out.println(arg);
    } else { // PULL Style
      if (o instanceof WeatherData) {
        WeatherData w = (WeatherData) o;
        System.out.printf("%f\t%f\t%f\n", w.getTemp(), w.getHumidity(), w.getPressure());
      }
    }
  }
}
