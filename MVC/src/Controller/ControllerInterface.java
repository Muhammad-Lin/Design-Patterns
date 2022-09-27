package Controller;

/**
 * @name: ControllerInterface
 * @author: yoga
 * @create: 2022-09-26 10:20
 **/
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
