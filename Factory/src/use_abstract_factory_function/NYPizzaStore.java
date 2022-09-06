package use_abstract_factory_function;

/**
 * @name: factory_function.NYPizzaStore
 * @author: yoga
 * @create: 2022-09-05 16:08
 **/
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese factory_function.Pizza");
        }
        else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie factory_function.Pizza");
        }
        else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam factory_function.Pizza");
        }else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni factory_function.Pizza");
        }
        return pizza;
    }
}
