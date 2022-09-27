package Model;

import Controller.BPMObserver;
import Controller.BeatObserver;

/**
 * @name: HeartModelInterface
 * @author: yoga
 * @create: 2022-09-27 09:05
 **/
public interface HeartModelInterface {
    int getHeartRate();
    void registerBeatObserver(BeatObserver observer);
    void registerBPMObserver(BPMObserver observer);
    void removeObserver(BeatObserver observer);
    void removeObserver(BPMObserver observer);
}
