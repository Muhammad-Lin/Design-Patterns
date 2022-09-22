package Factory;

/**
 * @name: QuackCounter
 * @author: yoga
 * @create: 2022-09-22 13:59
 **/
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
}
