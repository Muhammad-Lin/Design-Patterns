package com.yoga.Test;

import com.yoga.Implements.*;

/**
 * 气象站（测试用例）
 *
 * @name: WeatherStation
 * @author: yoga
 * @create: 2022-08-22 14:04
 **/
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);


        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
