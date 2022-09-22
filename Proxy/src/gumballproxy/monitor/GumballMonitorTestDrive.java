package gumballproxy.monitor;

import gumballproxy.machine.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @name: GumballMonitorTestDrive
 * @author: yoga
 * @create: 2022-09-21 11:46
 **/
public class GumballMonitorTestDrive {

    public static void main(String[] args) throws RemoteException {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                             "rmi://boulder.mightygumball.com/gumballmachine",
                             "rmi://seattle.mightygumball.com/gumballmachine"};

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++){
            try {
                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machineRemote);
                System.out.println(monitors[i]);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitors.length; i++)
            monitors[i].report();
    }
}
