package gumballproxy.monitor;

import gumballproxy.machine.GumballMachine;
import gumballproxy.machine.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * @name: pu
 * @author: yoga
 * @create: 2022-09-21 10:38
 **/
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() throws RemoteException {
        System.out.println("Gumball Machine：" + machine.getLocation());
        System.out.println("Current inventory：" + machine.getCount() + " gumballs");
        System.out.println("Current state：" + machine.getState());
    }
}
