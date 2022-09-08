package CommandModel;

/**
 * @name: CommandModel.CeilingFan
 * @author: yoga
 * @create: 2022-09-07 16:56
 **/
public class CeilingFan {

    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    void on(){
        System.out.println(name + " ceilingFan is on.");
    }

    void off(){
        System.out.println(name + " ceilingFan is off.");
    }
}
