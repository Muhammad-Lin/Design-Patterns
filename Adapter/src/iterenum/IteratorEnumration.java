package iterenum;

import java.util.ArrayList;
import java.util.function.IntFunction;

/**
 * @name: IteratorEnumration
 * @author: yoga
 * @create: 2022-09-09 13:46
 **/
public class IteratorEnumration implements Enumeration {
    Iterator iterator;

    public IteratorEnumration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Enumeration nextElement() {
        return (Enumeration) iterator.next();
    }
}
