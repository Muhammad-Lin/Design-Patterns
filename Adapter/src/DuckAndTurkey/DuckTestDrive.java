package DuckAndTurkey;

/**
 * @name: DuchTestDrive
 * @author: yoga
 * @create: 2022-09-09 09:58
 **/
public class DuckTestDrive {
    public static void main(String[] args){
        MallarDuck duck = new MallarDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The DuckAndTurkey.Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe DuckAndTurkey.Duck says...");
        testDuck(duck);

        System.out.println("\nThe DuckAndTurkey.TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
