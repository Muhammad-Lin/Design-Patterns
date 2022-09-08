package useStateToUndo;

/**
 * 关灯指令
 *
 * @name: LightOffCommand
 * @author: yoga
 * @create: 2022-09-07 16:27
 **/
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
