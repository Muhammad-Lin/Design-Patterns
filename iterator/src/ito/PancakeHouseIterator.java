package ito;

import java.util.ArrayList;

/**
 * @name: PancakeHouseIterator
 * @author: yoga
 * @create: 2022-09-14 11:16
 **/
public class PancakeHouseIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size())
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
