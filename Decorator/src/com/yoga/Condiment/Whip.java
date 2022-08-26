package com.yoga.Condiment;

import com.yoga.Beverage.Beverage;

/**
 * 配料子类——奶泡
 * 具体装饰者
 * @name: Whip
 * @author: yoga
 * @create: 2022-08-26 16:44
 **/
public class Whip extends CondimentDecorator{

    Beverage beverage;//用一个实例变量记录饮料（被装饰者）

    public Whip(Beverage beverage) {
        this.beverage = beverage;//让饮料（被装饰者）被记录到实例变量中
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、奶泡";
    }
}
