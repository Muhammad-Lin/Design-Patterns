package DuckAndTurkey;

/**
 * @name: DuckAndTurkey.DuckAdapter
 * @author: yoga
 * @create: 2022-09-09 10:14
 **/
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
