package com.yoga.Test;

import com.yoga.Beverage.Beverage;
import com.yoga.Beverage.DarkRoast;
import com.yoga.Beverage.Espresso;
import com.yoga.Beverage.HouseBlend;
import com.yoga.Condiment.Mocha;
import com.yoga.Condiment.Soy;
import com.yoga.Condiment.Whip;

/**
 * 测试下订单
 *
 * @name: StarbuzzCoffee
 * @author: yoga
 * @create: 2022-08-26 16:50
 **/
public class StarbuzzCoffee {

    public static void main(String[] args){

        Beverage beverage = new Espresso();//一杯不加任何调料的浓缩咖啡
        System.out.println(beverage.getDescription() + "：" + beverage.cost());

        //一杯加了双倍摩卡、奶泡的深焙咖啡
        Beverage beverage1 = new DarkRoast();//制造DarkRoast对象
        beverage1 = new Mocha(beverage1);//用Mocha装饰
        beverage1 = new Mocha(beverage1);//用第二个Mocha装饰
        beverage1 = new Whip(beverage1);//用Whip装饰
        System.out.println(beverage1.getDescription() + "：" + beverage1.cost());

        //一杯加了豆浆、摩卡、奶泡的综合咖啡
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "：" + beverage2.cost());
    }
}
