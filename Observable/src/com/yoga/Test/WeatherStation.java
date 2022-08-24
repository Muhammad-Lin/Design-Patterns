package com.yoga.Test;

import com.yoga.Implement.*;

/**
 * 气象站（测试类）
 *
 * @name: WeatherStation
 * @author: yoga
 * @create: 2022-08-23 11:22
 **/
public class WeatherStation {
    public static void main(String[] args){
        TestThreeDisplay();
        System.out.println();
        TestHeatIndex();
    }

    static void TestThreeDisplay(){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

    static void TestHeatIndex(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
