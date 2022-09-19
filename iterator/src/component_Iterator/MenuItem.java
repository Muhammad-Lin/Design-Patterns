package component_Iterator;

import java.util.Iterator;

/**
 * @name: MenuItem
 * @author: yoga
 * @create: 2022-09-13 16:25
 **/
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print(){
        System.out.print("  " + getName());
        if (isVegetarian())
            System.out.print("(v)");
        System.out.print(",  " + getPrice());
        System.out.println("    -- " + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
