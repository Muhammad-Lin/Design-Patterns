package CommandModel;

/**
 * @name:  CommandModel.GarageDoor
 * @author: yoga
 * @create: 2022-09-07 15:44
 **/
public class GarageDoor {

    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    void up(){
        System.out.println(name + "CommandModel.GarageDoor up.");
    }

    void down(){
        System.out.println(name + "CommandModel.GarageDoor down.");
    }

    void stop(){
        System.out.println(name + "CommandModel.GarageDoor stop.");
    }

    void lightOn(){
        System.out.println(name + "CommandModel.GarageDoor light on.");
    }

    void lightOff(){
        System.out.println(name + "CommandModel.GarageDoor light off.");
    }
}
