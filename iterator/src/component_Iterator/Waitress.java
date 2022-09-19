package component_Iterator;

import java.util.Iterator;

/**
 * @name: Waitress
 * @author: yoga
 * @create: 2022-09-19 14:35
 **/
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian())
                    menuComponent.print();
            }catch (UnsupportedOperationException e){}
        }
    }
}
