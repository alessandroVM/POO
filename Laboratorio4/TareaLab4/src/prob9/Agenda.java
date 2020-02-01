package prob9;
import java.util.Scanner;
public class Agenda {

	  public static void mostrar(Contacto con[],int n) {
		  for(int e=0;e<n;e++) {
			  System.out.println("Contacto "+(e+1));
			  System.out.println("Nombre: "+con[e].getNomb());
			  System.out.println("Numero: "+con[e].getNum());
			  System.out.println("Direccion: "+con[e].getDirecc());
		  }
	  }
	
  public static void main(String[] args) {
	  Scanner tec = new Scanner(System.in);
	  String nomb,direcc;
	  int num;
	  int tam;

	  System.out.println("Digite la cantidad de contactos a agregar");
	  tam=tec.nextInt();
	  Contacto con[] = new Contacto[tam];
	  
	  for(int i=0;i<con.length;i++) {
		  System.out.println("Contacto ["+(i+1)+"]");
		  System.out.println("Digite el nombre del contacto");
		   nomb =tec.next();
		   System.out.println("Digite la direccion del contacto");
		   direcc = tec.next();
		   System.out.println("Digite el telefono del contacto");
	       num = tec.nextInt();
	       
	       con[i] = new Contacto(nomb,direcc,num);
	  } 
	  mostrar(con,tam);
    }

  
}
