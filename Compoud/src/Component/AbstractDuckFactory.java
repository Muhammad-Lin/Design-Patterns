package Component;

/**
 * 抽象工厂
 * @name: AbstractDuckFactory
 * @author: yoga
 * @create: 2022-09-22 14:08
 **/
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
