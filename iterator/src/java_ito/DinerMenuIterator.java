package java_ito;


import java.util.Iterator;

/**
 * @name: DinerMenuIterator
 * @author: yoga
 * @create: 2022-09-14 11:06
 **/
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    public void remove(){
        if (position <= 0){
            throw new IllegalStateException("You can't remove an item until you've dome at least one next()");
        }
        if (items[position-1] != null){
            for (int i = position-1; i < items.length-1; i++)
                items[i] = items[i+1];
            items[items.length-1] = null;
        }
    }
}
