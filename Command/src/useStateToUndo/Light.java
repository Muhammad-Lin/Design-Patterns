package useStateToUndo;

/**
 * 灯具类
 *
 * @name: Light
 * @author: yoga
 * @create: 2022-09-07 15:04
 **/
public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    void on(){
        System.out.println(name + " Light is on.");
    }

    void off(){
        System.out.println(name + " Light is off.");
    }
}
