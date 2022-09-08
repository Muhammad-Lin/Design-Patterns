package useStateToUndo;

/**
 * @name: CeilingFanLowCommand
 * @author: yoga
 * @create: 2022-09-08 10:19
 **/
public class CeilingFanLowCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH)
            ceilingFan.high();
        else if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (prevSpeed == CeilingFan.LOW)
            ceilingFan.low();
        else if (prevSpeed == CeilingFan.OFF)
            ceilingFan.off();
    }
}
