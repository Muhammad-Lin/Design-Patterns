package com.yoga.Beverage;

/**
 * 饮料类子类——低咖啡因
 * 具体组件
 * @name: Decaf
 * @author: yoga
 * @create: 2022-08-26 16:30
 **/
public class Decaf extends Beverage{

    public Decaf() {
        description = "低咖啡因";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
