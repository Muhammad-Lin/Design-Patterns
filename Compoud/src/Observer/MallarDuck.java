package Observer;


/**
 * @name: MallarDuck
 * @author: yoga
 * @create: 2022-09-22 11:56
 **/
public class MallarDuck implements Quackable {
    Observable observable;

    public MallarDuck() {
        observable = new Observable(this);
    }

    public void quack(){
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Mallard Duck";
    }
}
