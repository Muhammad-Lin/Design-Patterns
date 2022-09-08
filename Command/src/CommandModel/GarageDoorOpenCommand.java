package CommandModel;

/**
 * @name: easyTest.CommandModel.GarageDoorOpenCommand
 * @author: yoga
 * @create: 2022-09-07 15:47
 **/
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
