package Client;
import java.rmi.Naming;
import Server.Adder;

public class Client {
    public static void main(String[] args) {
        try {
            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/Adder");
            System.out.println("Sum: " + stub.add(5, 3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
