package Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @name: Observable
 * @author: yoga
 * @create: 2022-09-23 09:54
 **/
public class Observable implements QuackObservable{
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
