

package com.yoga.Implement;

import com.yoga.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
