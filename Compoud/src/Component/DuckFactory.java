package Component;

/**
 * 此工厂创建没有装饰者的鸭子
 * @name: DuckFactory
 * @author: yoga
 * @create: 2022-09-22 14:10
 **/
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallarDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
