package WithHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @name: WithHook.TeaWithHook
 * @author: yoga
 * @create: 2022-09-13 11:12
 **/
public class TeaWithHook extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
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
        System.out.println("Would you like lemon with tea (y/n)? :");

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
