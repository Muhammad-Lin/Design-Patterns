package com.yoga.Beverage;

/**
 * 饮料类子类——浓缩咖啡
 * 具体组件
 * @name: Espresso
 * @author: yoga
 * @create: 2022-08-26 16:19
 **/
public class Espresso extends Beverage{

    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
