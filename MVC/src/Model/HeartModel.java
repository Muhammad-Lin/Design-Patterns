package Model;

import Controller.BPMObserver;
import Controller.BeatObserver;

import java.util.ArrayList;
import java.util.Random;

/**
 * @name: HeartModel
 * @author: yoga
 * @create: 2022-09-27 08:59
 **/
public class HeartModel implements HeartModelInterface,Runnable{
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList<>();
    int time = 1000;
    int bpm = 90;
    Random random = new Random(System.currentTimeMillis());
    Thread thread;

    public HeartModel() {
        thread = new Thread(this);
        thread.start();
    }

    public int getHeartRate(){
        return 60000/time;
    }

    public void registerBeatObserver(BeatObserver observer){
        beatObservers.add(observer);
    }

    public void registerBPMObserver(BPMObserver observer){
        bpmObservers.add(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        int i = beatObservers.indexOf(observer);
        if (i >= 0)
            beatObservers.remove(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        int i = bpmObservers.indexOf(observer);
        if (i >= 0)
            bpmObservers.remove(observer);
    }

    @Override
    public void run() {
        int lastrate = -1;
        for (;;){
            int change = random.nextInt(10);
            if (random.nextInt(2) == 0){
                change = 0 - change;
            }
            int rate = 60000 / (time + change);
            if (rate < 120 && rate > 50){
                time += change;
                notifyBeatObservers();
                if (rate != lastrate){
                    lastrate = rate;
                    notifyBPMObservers();
                }
            }
            try {
                Thread.sleep(time);
            }catch (Exception e){}
        }
    }

    private void notifyBPMObservers() {
        for (int i = 0; i < bpmObservers.size(); i++){
            BPMObserver observer = (BPMObserver) bpmObservers.get(i);
            observer.updateBPM();
        }
    }

    private void notifyBeatObservers() {
        for (int i = 0; i < beatObservers.size(); i++){
            BeatObserver observer = (BeatObserver) beatObservers.get(i);
            observer.updateBeat();
        }
    }
}
