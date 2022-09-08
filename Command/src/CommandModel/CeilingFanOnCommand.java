package CommandModel;

/**
 * @name: CommandModel.CeilingFanOnCommand
 * @author: yoga
 * @create: 2022-09-07 16:59
 **/
public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
