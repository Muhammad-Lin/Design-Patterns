package com.yoga.Implements;

import com.yoga.Interfaces.Observer;
import com.yoga.Interfaces.Subject;

import java.util.ArrayList;


/**
 * 天气数据
 *
 * @name: WeatherData
 * @author: yoga
 * @create: 2022-08-22 11:47
 **/
public class WeatherData implements Subject {
    /**
     * 观察者集
     */
    private ArrayList<Observer> observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 压力
     */
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0) {
            observers.remove(index);
            System.out.println("Removed the Observer " + observer.getClass());
            System.out.println();
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 通知观察者
     * @param: []
     * @return: void
     * @author: yoga
     * @date: 13:57 2022-8-22
     **/
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //WeatherData的其他方法
    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
