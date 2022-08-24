package com.yoga.Implements;

import com.yoga.Interfaces.DisplayElement;
import com.yoga.Interfaces.Observer;

/**
 * 统计布告板
 *
 * @name: StatisticsDisplay
 * @author: yoga
 * @create: 2022-08-22 14:21
 **/
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "+ (tempSum / numReadings)+ "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempSum += temp;
        this.numReadings++;
        if(temp > maxTemp)
            maxTemp = temp;
        if(temp < minTemp)
            minTemp = temp;
        display();
    }
}
