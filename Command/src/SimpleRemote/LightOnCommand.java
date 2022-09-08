package SimpleRemote;

/**
 * 开灯指令类
 *
 * @name: easyTest.CommandModel.LightOnCommand
 * @author: yoga
 * @create: 2022-09-07 15:02
 **/
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();//调用接收对象的on()方法
    }
}
