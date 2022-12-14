package factory_function;

import java.util.ArrayList;

/**
 * 披萨类（产品类）
 * 工厂产品，对于PizzaStore而言，产品就是PIzza
 * @name: factory_function.Pizza
 * @author: yoga
 * @create: 2022-09-02 15:49
 **/
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++)
            System.out.println("   " + toppings.get(i));
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official factory_function.PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
