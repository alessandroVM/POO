import javax.swing.JOptionPane;

import java.util.Scanner;

public class Agenda {
    static Contacto [] listaContac = new Contacto[10];
    
    public static void main(String[] args){
    	int opc,edad,i=0,ind,e=0;
    	String nomb;
    	double salario;
    	do {
        	System.out.println("1. Agregar contacto");
        	System.out.println("2. Eliminar contacto");
        	System.out.println("3. Salir");
        	opc=Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion"));
        	switch(opc){
        	case 1:
        		nomb=JOptionPane.showInputDialog("Nombre: ");
        		edad=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        		salario=Float.parseFloat(JOptionPane.showInputDialog("Salario: "));
                listaContac[i]= new Contacto(nomb,edad,salario);
               
                	System.out.print(listaContac[i].getNomb()); 
                    System.out.print(" "+listaContac[i].getSalario()); 
                    System.out.print(" "+listaContac[i].getEdad());
                    System.out.println();
        		i++;
        		break;
        	case 2: ind=Integer.parseInt(JOptionPane.showInputDialog("Digite el indice a eliminar: "));
        	eliminarContac(ind);
        	break;
        	}

    	}while (opc!=3 | i==9);
        
    }
    public static void eliminarContac(int indice){
        listaContac[indice-1]=null;
    }

}