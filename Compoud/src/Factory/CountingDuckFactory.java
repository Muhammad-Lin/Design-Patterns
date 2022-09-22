package Factory;


/**
 * 创建真正需要的工厂
 * @name: CountingDuckFactory
 * @author: yoga
 * @create: 2022-09-22 14:11
 **/
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallarDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
