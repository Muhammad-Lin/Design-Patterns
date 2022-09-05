package use_factory_function;

/**
 * 披萨商店（创建者类）
 *这是抽象创建者类，定义了一个抽象的工厂方法，让子类实现此方法制造产品
 *创建者通常会包含依赖于抽象产品的代码，而这些抽象产品由子类制造。
 *创建者不需要真的知道在知道哪种具体产品。
 * @name: PizzaStore
 * @author: yoga
 * @create: 2022-09-02 15:52
 **/
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
