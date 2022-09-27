package Test;

import Controller.ControllerInterface;
import Controller.HeartController;
import Model.HeartModel;

/**
 * @name: HeartTestDrive
 * @author: yoga
 * @create: 2022-09-27 09:14
 **/
public class HeartTestDrive {
    public static void main (String[] args){
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
