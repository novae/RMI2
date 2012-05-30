import java.rmi.*;
import java.rmi.Naming;
	public class ClienteSuma{
		public static void main(String arg []){
			try{
				Interfaz obj=(Interfaz)Naming.lookup("/Servidorsuma"); //Obtener Referencia del Objeto
				int a=10;
                                int b=5;
                                int resultado=obj.sumar(a, b);
				System.out.println("el resultado de la suma es: "+resultado);
			}
			catch(Exception e){
				System.out.println("excpcion del cliente "+e);
			}
		}
	}