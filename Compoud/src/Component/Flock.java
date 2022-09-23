package Component;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @name: Flock
 * @author: yoga
 * @create: 2022-09-22 15:28
 **/
public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();


    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }
    }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

}
