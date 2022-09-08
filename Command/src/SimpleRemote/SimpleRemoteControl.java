package SimpleRemote;

/**
 * @name: easyTest.CommandModel.SimpleRemoteControl
 * @author: yoga
 * @create: 2022-09-07 15:06
 **/
public class SimpleRemoteControl {
    Command slot;//有一个插槽持有命令，而这个命令控制着一个装置

    public SimpleRemoteControl(){}

    //设置插槽控制的命令
    // 如果这段代码的客户想要改变遥控器按钮的行为，可以多次调用此方法
    public void setCommand(Command command){
        slot = command;
    }

    //按下按钮时，该方法被调用
    //使得当前命令衔接插槽，并调用它的execute()方法
    public void buttonWasPressed(){
        slot.execute();
    }
}
