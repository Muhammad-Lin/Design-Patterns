

package com.yoga.Test;

import com.yoga.Implement.Duck;
import com.yoga.Implement.FlyRocketPowered;
import com.yoga.Implement.MallardDuck;
import com.yoga.Implement.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
