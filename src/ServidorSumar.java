import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class ServidorSumar extends UnicastRemoteObject implements Interfaz{
		
		public ServidorSumar() throws RemoteException{
			super();
		}  //El objeto remoto existe y esta listo para aceptar invocaciones
		
		public int sumar(int a, int b)throws RemoteException{
			return a+b;
		}
		
		public static void main(String [] args){
			try{
				ServidorSumar obj=new ServidorSumar();
				Naming.rebind("/Servidorsuma",obj); //Registrar Objetos en el servidor
				System.out.println("Objeto registrado en el servidor de nombres");
			}
			catch(Exception e){
				System.err.println(e);
			}
		}
}