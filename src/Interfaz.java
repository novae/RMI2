import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interfaz extends Remote{
	public int sumar(int a, int b)throws RemoteException;
}