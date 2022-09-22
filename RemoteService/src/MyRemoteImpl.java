import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.spec.ECField;

/**
 * 远程服务器
 * @name: MyRemoteImpl
 * @author: yoga
 * @create: 2022-09-21 11:08
 **/
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main (String[] args){
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
