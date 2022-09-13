package WithHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @name: WithHook.CoffeeWithHook
 * @author: yoga
 * @create: 2022-09-13 11:04
 **/
public class CoffeeWithHook extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Dripping WithHook.Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase(Locale.ROOT).startsWith("y"))
            return true;
        else
            return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with coffee (y/n)? :");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException ioe){
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null)
            return "no";
        return answer;
    }
}
