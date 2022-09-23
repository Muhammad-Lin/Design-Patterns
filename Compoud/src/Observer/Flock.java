package Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @name: Flock
 * @author: yoga
 * @create: 2022-09-22 15:28
 **/
public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }
    }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quackable = (Quackable) iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }
}
