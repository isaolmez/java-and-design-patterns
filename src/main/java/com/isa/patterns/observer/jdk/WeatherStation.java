package com.isa.patterns.observer.jdk;

import java.util.Observable;

public class WeatherStation extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        measurementsChanged();
    }
}
