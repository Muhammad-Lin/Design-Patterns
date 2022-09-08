package CommandModel;

/**
 * 灯具类
 *
 * @name: easyTest.CommandModel.Light
 * @author: yoga
 * @create: 2022-09-07 15:04
 **/
public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    void on(){
        System.out.println(name + " CommandModel.Light is on.");
    }

    void off(){
        System.out.println(name + " CommandModel.Light is off.");
    }
}
