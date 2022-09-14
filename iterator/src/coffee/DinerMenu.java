package coffee;

import java.util.Iterator;

/**
 * @name: DinerMenu
 * @author: yoga
 * @create: 2022-09-14 11:10
 **/
public class DinerMenu implements Menu {
    static final int Max_Items = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[Max_Items];
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day", "with a side of potato salad",false,3.29);
        addItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese", false,3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= Max_Items)
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
