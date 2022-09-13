package WithHook;

/**
 * @name: WithHook.Tea
 * @author: yoga
 * @create: 2022-09-13 09:44
 **/
public class Tea extends CaffeineBeverage{

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public void brew() {
        System.out.println("Steeping the tea");
    }
}
