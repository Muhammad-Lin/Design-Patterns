package Component;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @name: Waitress
 * @author: yoga
 * @create: 2022-09-14 16:50
 **/
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
