package iterenum;

/**
 * @name: EnumerationIterator
 * @author: yoga
 * @create: 2022-09-09 13:39
 **/
public class EnumerationIterator implements Iterator{
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
