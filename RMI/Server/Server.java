package Server;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(5000); // Create registry on port 5000
        Naming.rebind("rmi://localhost:5000/Adder", new AdderImpl());
        System.out.println("Server ready on port 5000");
    }
}
