import java.rmi.*;

/**
 * 远程接口
 * @name: MyRemote
 * @author: yoga
 * @create: 2022-09-21 11:07
 **/
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
