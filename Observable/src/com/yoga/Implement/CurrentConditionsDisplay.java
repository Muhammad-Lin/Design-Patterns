package com.yoga.Implement;

import com.yoga.Interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 天气状态布告板
 *
 * @name: CurrentCoditionsDisplay
 * @author: yoga
 * @create: 2022-08-23 11:16
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
