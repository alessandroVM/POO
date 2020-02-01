package prob10;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
    	registPerso();
    	registLib();
    }
    public static void registPerso() {
    	String nomb;
    	String direcc;
    	int telf;
    Scanner entrada= new Scanner(System.in);

      System.out.println("Presione ENTER...");
       entrada.nextLine();
 	   System.out.print("Digite su nombre: ");
 	   nomb = entrada.nextLine();
 	   System.out.print("Digite su direccion: ");
 	   direcc= entrada.nextLine();
 	   System.out.print("Digite su telefono: ");
 	   telf= entrada.nextInt();
 	   Persona per = new Persona(nomb,direcc,telf);
    }
    public static void registLib() {
        int nlib;
    	Scanner entrada= new Scanner(System.in);
    	System.out.print("Digite cuantos libros desea registrar: ");
  	    nlib=entrada.nextInt();
    	Libro lib[] = new Libro[nlib];
    	Prestamo pres = new Prestamo();
    	pres.registroLib(lib);
    	
    }
}
