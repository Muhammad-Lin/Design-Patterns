package SimpleRemote;

/**
 * 命令模式的客户
 *
 * @name: easyTest.RemoteControlTest
 * @author: yoga
 * @create: 2022-09-07 15:12
 **/
public class RemoteControlTest {
    public static void main(String[] args){
        //遥控器就是调用者，会传入一个命令对象，可以用来发出请求
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //创建电灯对象，此对象也就是请求的接收者
        Light light = new Light();
        //创建命令，然后将接收者传给它
        LightOnCommand lightOn = new LightOnCommand(light);
        //将命令传给调用者
        remote.setCommand(lightOn);
        //模拟按下按钮
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
