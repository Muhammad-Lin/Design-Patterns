package component_Iterator;

import java.util.Iterator;

/**
 * @name: NullIterator
 * @author: yoga
 * @create: 2022-09-19 14:31
 **/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
