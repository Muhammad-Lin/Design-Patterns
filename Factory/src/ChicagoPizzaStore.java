/**
 * Chicago披萨
 *
 * @name: ChicagoPizzaStore
 * @author: yoga
 * @create: 2022-09-02 17:00
 **/
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if (type.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        else if (type.equals("clam"))
            return new ChicagoStyleClamPizza();
        else if (type.equals("pepperoni"))
            return new ChicagoStylePepperoniPizza();
        else
            return null;
    }
}
