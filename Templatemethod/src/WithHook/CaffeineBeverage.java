package WithHook;

/**
 * @name: WithHook.CaffeineBeverage
 * @author: yoga
 * @create: 2022-09-13 09:50
 **/
public abstract class CaffeineBeverage {

    final void prepareRecipe(){//模板方法
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    boolean customerWantsCondiments() {
        return true;
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew() ;//需要由子类提供的方法，必须在超类中声明为抽象

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments() ;
}
