package com.yoga.Beverage;

/**
 * 饮料类子类——综合咖啡
 * 具体组件
 * @name: HouseBlend
 * @author: yoga
 * @create: 2022-08-26 16:23
 **/
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "综合咖啡";
    }

    @Override
    public double cost() {
        return .89;
    }
}
