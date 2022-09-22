package gumballproxy.machine;

import gumballproxy.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @name: GumballMachineRemote
 * @author: yoga
 * @create: 2022-09-21 11:33
 **/
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
