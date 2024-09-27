package Server;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AdderImpl extends UnicastRemoteObject implements Adder {
    public AdderImpl() throws RemoteException { }
    public int add(int x, int y) {
        return x + y;
    }
}
