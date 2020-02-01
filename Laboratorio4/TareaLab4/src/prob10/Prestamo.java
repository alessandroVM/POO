package prob10;

import java.util.Scanner;

public class Prestamo {
  private char fechaP[];
  private int plazo;
  private int codPre;
  Persona p;
  Scanner entrada = new Scanner(System.in);
public Prestamo() {
	
}
public char[] getFechaP() {
	return fechaP;
}
public void setFechaP(char fechaP[]) {
	this.fechaP = fechaP;
}
public int getPlazo() {
	return plazo;
}
public void setPlazo(int plazo) {
	this.plazo = plazo;
}
public int getCodPre() {
	return codPre;
}
public void setCodPre(int codPre) {
	this.codPre = codPre;
}

  public void registroLib(Libro lib[]) {

	  String titulo;
	  int codLib;
	  char estado;
	  for(int i=0;i<lib.length;i++) {
		  lib[i] = new Libro();
		  entrada.nextLine();
		  System.out.println("\nLibro ["+(i+1)+"]");
		  System.out.print("Nombre: ");
		  lib[i].setTitulo(entrada.nextLine()); ;
		  lib[i].setCodLib(i+1);;
		  System.out.print("estado [D/N] : ");
		  lib[i].setEstado(entrada.nextLine().charAt(0));
          System.out.print("PRESIONE ENTER..");
	  }
	  System.out.println("REALIZANDO PEDIDO...");
	  System.out.print("Digite el codigo del libro ");
	  int codA = entrada.nextInt();
	  hacerPed(lib,codA);
  }

  public void hacerPed(Libro lib[],int codA){
	  Prestamo pres;
      
	  if(lib[codA-1].getEstado()=='d') {
		  for(int i=0;i<lib.length;i++) {
			  if(codA==lib[i].getCodLib()) {
				  System.out.println("Titulo : "+lib[i].getTitulo());
				  System.out.print("Digite la fecha de hoy: ");
				  fechaP=entrada.next().toCharArray();
				  System.out.print("Digite el plazo(dias) : ");
				  plazo = entrada.nextInt();
				  codPre=i+1;
				  mostrarD(lib,codA);
			  }
		  }
		  
	  }else {
		  System.out.print("Libro no disponible");
	  }
	 mostrarD(lib,codA);
  }
  public void mostrarD(Libro lib[],int codA) {
	  entrada.nextLine();
	  codA=codA-1;
	  System.out.println("\nPrestamo Aceptado");
	  System.out.println("Titulo: "+lib[codA].getTitulo());
	  System.out.print("Fecha de prestamo: ");
	  for(int e=0;e<fechaP.length;e++) {
		  System.out.print(fechaP[e]);		  
	  }
	  System.out.println("\nPlazo : "+plazo);
  }
}
