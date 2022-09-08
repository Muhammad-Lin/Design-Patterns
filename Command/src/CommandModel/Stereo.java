package CommandModel;

/**
 * 音响类
 *
 * @name: CommandModel.Stereo
 * @author: yoga
 * @create: 2022-09-07 16:33
 **/
public class Stereo {

    String name;

    public Stereo(String name) {
        this.name = name;
    }

    void on(){
        System.out.println(name + " CommandModel.Stereo is on.");
    }

    void off(){
        System.out.println(name + " CommandModel.Stereo is off");
    }

    void setCd(){
        System.out.println(name + " CommandModel.Stereo is playing Cd.");
    }

    void setDvd(){
        System.out.println(name + " CommandModel.Stereo is playing Dvd.");
    }

    void setRadio(){
        System.out.println(name + " CommandModel.Stereo is playing Radio.");
    }

    void setVolume(int num){
        System.out.println(name + " CommandModel.Stereo is set Volume value " + num + "。");
    }
}
