package Decorator;


/**
 * @name: GooseAdapter
 * @author: yoga
 * @create: 2022-09-22 13:52
 **/
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
