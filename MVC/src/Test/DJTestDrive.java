package Test;

import Controller.BeatController;
import Controller.ControllerInterface;
import Model.BeatModel;
import Model.BeatModelInterface;

/**
 * @name: DJTestDrive
 * @author: yoga
 * @create: 2022-09-26 10:27
 **/
public class DJTestDrive {
    public static void main (String[] args){
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
