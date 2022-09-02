package com.yoga.Condiment;

import com.yoga.Beverage.Beverage;

/**
 * 调料抽象类
 * 抽象装饰者类
 * @name: CondimentDecorator
 * @author: yoga
 * @create: 2022-08-26 16:16
 **/
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize(){return beverage.getSize();}
}
