package Controller;

import Model.HeartAdapter;
import Model.HeartModelInterface;
import View.DJView;

/**
 * @name: HeartController
 * @author: yoga
 * @create: 2022-09-27 09:12
 **/
public class HeartController implements ControllerInterface{
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(new HeartAdapter(model),this);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}
