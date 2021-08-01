
package cliente;

import java.rmi.Remote; 
import java.rmi.RemoteException; 

public interface Interface extends Remote{
    public String add(String base) throws RemoteException;
}
