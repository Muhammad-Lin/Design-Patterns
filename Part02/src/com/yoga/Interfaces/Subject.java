package com.yoga.Interfaces;



/**
 * 主题
 *
 * @name: Subject
 * @author: yoga
 * @create: 2022-08-22 11:34
 **/
public interface Subject {
    /**
     * 注册观察者（订阅）
     * @param: [observer]
     * @return: void
     * @author: yoga
     * @date: 11:38 2022-8-22
     **/
    public void registerObserver(Observer observer);
    /**
     * 删除观察者（取消订阅）
     * @param: [observer]
     * @return: void
     * @author: yoga
     * @date: 11:39 2022-8-22
     **/
    public void removeObserver(Observer observer);
    /**
     * 通知所有观察者（当主题状态改变时）
     * @param: []
     * @return: void
     * @author: yoga
     * @date: 11:41 2022-8-22
     **/
    public void notifyObservers();
}
