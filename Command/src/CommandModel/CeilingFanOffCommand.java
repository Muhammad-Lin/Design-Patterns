package CommandModel;

/**
 * @name: CommandModel.CeilingFanOffCommand
 * @author: yoga
 * @create: 2022-09-07 17:00
 **/
public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
