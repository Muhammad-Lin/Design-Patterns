package com.yoga.Implement;

import com.yoga.Interfaces.FlyBehavior;

/**
 * @program: Part01
 * @ClassName FlyRocketPowered
 * @description: TODO
 * @author: yoga ma
 * @create: 2022-08-19 14:56
 * @Version 1.0
 **/
public class FlyRocketPowered implements FlyBehavior {
    public void fly(){
        System.out.println("I'm flying with a rocket!");
    }
}
