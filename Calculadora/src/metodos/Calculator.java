import java.rmi.*;

public interface Calculator extends Remote{
	public int sum(int x, int y) throws RemoteException;
    public int rest(int x, int y) throws RemoteException;
    public int mult(int x, int y) throws RemoteException;
    public float div(float x, float y) throws RemoteException;
    public int mod(int x, int y) throws RemoteException;
    public double pot(int x, int y) throws RemoteException;
}
