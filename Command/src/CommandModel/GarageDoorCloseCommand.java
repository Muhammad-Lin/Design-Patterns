package CommandModel;

/**
 * @name: GarageDoorOffCommand
 * @author: yoga
 * @create: 2022-09-07 16:41
 **/
public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
