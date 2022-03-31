import java.rmi.Naming;

public class Server {
    public static void main(String args[]) {
        try {
        	Calculator server = new CalculatorRemote();
            Naming.rebind("rmi://localhost:3000/test", server);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
