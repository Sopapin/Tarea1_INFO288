import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;
import java.lang.Math;

public class CalculatorRemote extends UnicastRemoteObject implements Calculator {
    public CalculatorRemote() throws RemoteException{
        super();
    }
    
    Scanner sc = new Scanner(System.in);
    
    public int sum(int x, int y) throws RemoteException{
        return x + y;
    }
    public int rest(int x, int y) throws RemoteException{
        return x - y;
    }
    public int mult(int x, int y) throws RemoteException{
        return x * y;
    }
    public float div(float x, float y) throws RemoteException{
        return x / y;
    }
    public int mod(int x, int y) throws RemoteException{
        return x % y;
    }
    public double pot(int x, int y) throws RemoteException{
        return Math.pow(x, y);
    }
}