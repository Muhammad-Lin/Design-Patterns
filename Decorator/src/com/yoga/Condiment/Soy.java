package com.yoga.Condiment;

import com.yoga.Beverage.Beverage;

/**
 * 配料子类——豆浆
 * 具体装饰者
 * @name: Soy
 * @author: yoga
 * @create: 2022-08-26 16:41
 **/
public class Soy extends CondimentDecorator{

    Beverage beverage;//用一个实例变量记录饮料（被装饰者）

    public Soy(Beverage beverage) {
        this.beverage = beverage;//让饮料（被装饰者）被记录到实例变量中
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、豆浆";
    }
}
