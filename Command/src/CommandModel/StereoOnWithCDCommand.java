package CommandModel;

/**
 * @name: CommandModel.StereoOnWithCDCommand
 * @author: yoga
 * @create: 2022-09-07 16:36
 **/
public class StereoOnWithCDCommand implements Command{

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
