package Duck;

/**
 * @name: DuckSimulator
 * @author: yoga
 * @create: 2022-09-22 11:59
 **/
public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallarDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
