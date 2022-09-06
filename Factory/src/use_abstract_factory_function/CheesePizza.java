package use_abstract_factory_function;

/**
 * @name: CheesePizza
 * @author: yoga
 * @create: 2022-09-05 14:33
 **/
public class CheesePizza extends Pizza{
    /**
     * 工厂
     */
    PizzaIngredientFactory ingredientFactory;

    //要制作披萨，需要工厂提供原料，所以每个披萨都需要从构造器参数中得到一个工厂
    // 并把这个工厂存储在一个实例变量中
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
