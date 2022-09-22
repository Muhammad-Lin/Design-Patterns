package Factory;

/**
 * @name: pu
 * @author: yoga
 * @create: 2022-09-22 11:57
 **/
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
