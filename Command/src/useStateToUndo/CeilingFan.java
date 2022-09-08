package useStateToUndo;

/**
 * 吊扇类
 *
 * @name: ceilingFan
 * @author: yoga
 * @create: 2022-09-08 10:04
 **/
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;//设置高转速
        System.out.println("ceilingFan is on high.");
    }

    public void medium(){
        speed = MEDIUM;//设置中转速
        System.out.println("ceilingFan is on medium.");
    }

    public void low(){
        speed = LOW;//设置低转速
        System.out.println("ceilingFan is on low.");
    }

    public void off(){
        speed = OFF;//关闭吊扇
        System.out.println("ceilingFan is off.");
    }

    public int getSpeed() {
        return speed;
    }
}
