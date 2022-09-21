package gumballstate;

/**
 * @name: GumballMachineTestDrive
 * @author: yoga
 * @create: 2022-09-20 17:09
 **/
public class GumballMachineTestDrive {
    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(4);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

    }
}
