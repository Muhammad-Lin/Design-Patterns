package Observer;

/**
 * @name: Goose
 * @author: yoga
 * @create: 2022-09-22 13:51
 **/
public class Goose {
    public void honk(){
        System.out.println("Honk");
    }

    @Override
    public String toString() {
        return "Goose";
    }
}
