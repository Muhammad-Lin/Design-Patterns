package Observer;


/**
 * @name: QuackObservable
 * @author: yoga
 * @create: 2022-09-23 09:52
 **/
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
