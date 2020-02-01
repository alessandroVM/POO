package prob11;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	  static ArrayList<Persona> person = new ArrayList<Persona>();
	  static Scanner entrada= new Scanner(System.in);
	  public static void main(String[] args) {
	     registro();
		 mostrar();
  }
	  public static void registro() {
		  char resp;
		  String nomb,padre,madre;
		  int edad;
		   do {
			   System.out.println("Digite el nombre: ");
			   nomb=entrada.next();
			   System.out.println("Digite la edad: ");
			   edad=entrada.nextInt();
			   System.out.println("Digite el padre: ");
			   padre=entrada.next();
			   System.out.println("Digite la madre: ");
			   madre=entrada.next();
			   Persona persona = new Persona(nomb,padre,madre,edad);
		       person.add(persona);
               System.out.println("Desea agregar a otra persona? (S/N): ");
               resp=entrada.next().charAt(0);
		   }while(resp=='s');
	  }
	  public static void mostrar() {
		  for(Persona per: person) {
			  System.out.print(per.toString());
		  }
	  }
}
