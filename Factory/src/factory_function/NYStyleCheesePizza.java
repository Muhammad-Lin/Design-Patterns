package factory_function;

/**
 * NY风味披萨
 * 具体产品
 * @name: factory_function.NYStyleCheesePizza
 * @author: yoga
 * @create: 2022-09-05 09:30
 **/
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese factory_function.Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
