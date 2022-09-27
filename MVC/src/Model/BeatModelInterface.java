package Model;

import Controller.BPMObserver;
import Controller.BeatObserver;

/**
 * @name: BeatModelInterface
 * @author: yoga
 * @create: 2022-09-23 16:58
 **/
public interface BeatModelInterface {

    //控制器调用
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();

    //允许视图和控制器取得状态，并变成观察者
    //希望每个节拍都被通知
    void registerObserver(BeatObserver observer);
    void removeObserver(BeatObserver observer);
    //希望BPM改变时通知
    void registerObserver(BPMObserver observer);
    void removeObserver(BPMObserver observer);
}
