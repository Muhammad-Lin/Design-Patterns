package com.yoga.Implements;

import com.yoga.Interfaces.DisplayElement;
import com.yoga.Interfaces.Observer;
import com.yoga.Interfaces.Subject;

/**
 * 实时气象布告板
 *
 * @name: CurrentConditionsDisplay
 * @author: yoga
 * @create: 2022-08-22 13:57
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
        "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
