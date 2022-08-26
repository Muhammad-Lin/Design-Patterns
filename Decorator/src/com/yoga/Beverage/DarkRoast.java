package com.yoga.Beverage;

/**
 * 饮料类子类——深焙咖啡
 * 具体组件
 * @name: DarkRoast
 * @author: yoga
 * @create: 2022-08-26 16:28
 **/
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "深焙咖啡";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
