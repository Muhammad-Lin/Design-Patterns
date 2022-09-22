package Adapter;

/**
 * @name: RubberDuck
 * @author: yoga
 * @create: 2022-09-22 11:58
 **/
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
