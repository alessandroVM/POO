package Ejercicios;
import javax.swing.JOptionPane;
public class P4 {

   public static void main (String args[]) {
	   String pal;
	   int voc;
	   P4 texto = new P4();
	   pal= JOptionPane.showInputDialog("Ingrese la palabra = ");
	   voc=texto.vocal(pal);
	   System.out.println("Palabra: "+ pal);
	   System.out.println("Numero de vocales "+ voc);
   }
   public int vocal(String pal) {
       int vocal=0,n,i;
       char x;
       n=pal.length();
	   for(i=0;i<n;i++) {
		   x=pal.charAt(i);
		   if(x=='a' | x=='e' | x=='i' |x=='o' |x=='u') {
			   vocal++;
		   }
	   }
	   return vocal;
   }
}
