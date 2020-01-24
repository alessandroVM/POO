package Ejercicios;
import javax.swing.JOptionPane;

public class P3 {
	   
	public static void main (String args[]) {
		 String pal,aux="";
		 char x;
		 int n,i;
		 pal= JOptionPane.showInputDialog("Ingrese la palabra = ");
		 n=pal.length();
		 for(i=n-1; i>=0;i--) {
			 x=pal.charAt(i);
			 aux=aux+x;
		 }
		 if(pal.compareTo(aux)==0) {
			   System.out.println("Es una palabra palindromo");			 
		 }else {
			   System.out.println("No es una palabra palindromo");
		 }
	   }
}