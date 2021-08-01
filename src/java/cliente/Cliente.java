
package cliente;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import cliente.Interface;

/**
 *
 * @author Faroukmn_97
 */
public class Cliente {

   public String rmiCliente(String b64) {
        String ruta="";
        try {
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            Interface IC = (Interface) r.lookup("server");
            ruta = IC.add(b64);            
            return "asdas";
        } catch (NotBoundException | RemoteException e) {            
            return e.getMessage();
        }
        
    }  
}
