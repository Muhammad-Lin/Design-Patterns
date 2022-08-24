package com.yoga.Interfaces;

/**
 * 观察者
 *
 * @name: Observer
 * @author: yoga
 * @create: 2022-08-22 11:40
 **/
public interface Observer {
    /**
     * 将观测值传递给观察者（当观测值改变时）
     * 所有观察者都必须实现此方法
     * @param: [temp, humidity, pressure]
     * @return: void
     * @author: yoga
     * @date: 11:44 2022-8-22
     **/
    public void update(float temp, float humidity, float pressure);
}
