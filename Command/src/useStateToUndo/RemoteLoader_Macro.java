package useStateToUndo;

/**
 * @name: RemoteLoader_Macro
 * @author: yoga
 * @create: 2022-09-08 11:13
 **/
public class RemoteLoader_Macro {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partOn);
        MacroCommand partyOffMacro = new MacroCommand(partOff);

        remoteControl.setCommand(0,partyOnMacro,partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("------ Pushing Macro On ------");
        remoteControl.onButtonWasPushed(0);
        System.out.println("------ Pushing Macro Off ------");
        remoteControl.offButtonWasPushed(0);
        System.out.println("------ Undo ------");
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
    }
}
