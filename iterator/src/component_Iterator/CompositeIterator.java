package component_Iterator;

import java.util.*;

/**
 * 组合迭代器
 *
 * @name: CompositeIterator
 * @author: yoga
 * @create: 2022-09-15 16:53
 **/
public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty())
            return false;
        else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }
            else return true;
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu)
                stack.push(component.createIterator());
            return component;
        }
        else return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
