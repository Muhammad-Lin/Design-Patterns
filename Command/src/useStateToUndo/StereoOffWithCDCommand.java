package useStateToUndo;

/**
 * @name: StereoOffWithCDCommand
 * @author: yoga
 * @create: 2022-09-07 16:39
 **/
public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
