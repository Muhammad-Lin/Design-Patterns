package use_factory_function;

/**
 * 原料接口，负责创建所有的原料
 *
 * @name: PizzaIngredientFactory
 * @author: yoga
 * @create: 2022-09-05 14:09
 **/
public interface PizzaIngredientFactory {
    //每个原料都有一个对应的方法创建该原料
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

    /**
     * 如果每个工厂实例都有某一种通用的”机制“需要实现，就可以把这个例子改写成抽象类
     */
}
