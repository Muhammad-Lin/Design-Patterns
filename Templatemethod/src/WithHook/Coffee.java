package WithHook;

/**
 * @name: WithHook.Coffee
 * @author: yoga
 * @create: 2022-09-13 09:39
 **/
public class Coffee extends CaffeineBeverage{

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public void brew() {
        System.out.println("Dripping WithHook.Coffee through filter");
    }
}
