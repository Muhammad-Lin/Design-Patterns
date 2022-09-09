package DuckAndTurkey;

/**
 * @name: DuckAndTurkey.MallarDuck
 * @author: yoga
 * @create: 2022-09-09 08:36
 **/
public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
