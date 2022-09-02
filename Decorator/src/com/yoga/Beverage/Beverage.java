package com.yoga.Beverage;

/**
 * 饮料类基类
 * 抽象组件
 * @name: Beverage
 * @author: yoga
 * @create: 2022-08-26 16:11
 **/
public abstract class Beverage {

    /**
     * 饮料描述
     */
    String description = "未知饮料";
    Size size = Size.TALL;
    public enum Size{
        TALL,
        GRANDE,
        VENTI
    }
    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}