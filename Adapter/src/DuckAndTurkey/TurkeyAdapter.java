package DuckAndTurkey;

/**
 * @name: DuckAndTurkey.TurkeyAdapter
 * @author: yoga
 * @create: 2022-09-09 08:45
 **/
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
