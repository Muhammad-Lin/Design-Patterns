package useStateToUndo;

/**
 * @name: RemoteLoader
 * @author: yoga
 * @create: 2022-09-08 10:27
 **/
public class RemoteLoader {
    public static void main(String[] args){
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControlWithUndo.setCommand(0,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(1,ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.onButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}
