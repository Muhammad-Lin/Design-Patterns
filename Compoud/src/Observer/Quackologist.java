package Observer;

/**
 * @name: Quackologist
 * @author: yoga
 * @create: 2022-09-23 10:06
 **/
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist：" + duck + " just quacked.");
    }

    @Override
    public String toString() {
        return "Quackologist";
    }
}
