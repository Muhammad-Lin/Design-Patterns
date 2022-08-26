package com.yoga.Condiment;

import com.yoga.Beverage.Beverage;

/**
 * 配料子类——摩卡
 * 具体装饰者
 * @name: Mocha
 * @author: yoga
 * @create: 2022-08-26 16:35
 **/
public class Mocha extends CondimentDecorator{

    Beverage beverage;//用一个实例变量记录饮料（被装饰者）

    public Mocha(Beverage beverage) {
        this.beverage = beverage;//让饮料（被装饰者）被记录到实例变量中
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、摩卡";
    }
}
