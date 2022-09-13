package DuckAndTurkey;

import java.util.Random;

/**
 * @name: DuckAndTurkey.DuckAdapter
 * @author: yoga
 * @create: 2022-09-09 10:14
 **/
public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(random.nextInt(5) == 0)
            duck.fly();
    }
}
