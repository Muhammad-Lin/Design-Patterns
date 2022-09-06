package factory_function;

/**
 * Chicago风味披萨
 *
 * @name: factory_function.ChicagoStyleCheesePizza
 * @author: yoga
 * @create: 2022-09-05 09:31
 **/
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese factory_function.Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "PLum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
