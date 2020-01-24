package Ejercicios;
import javax.swing.JOptionPane;
public class P6 {

   public static void main (String args[]) {
	   String text;
	   int npal;
	   P6 texto = new P6();
	   text= JOptionPane.showInputDialog("Ingrese la palabra = ");
	   npal=texto.palab(text);
	   System.out.println("Palabra: "+ text);
	   System.out.println("Numero de palabras "+ npal);
   }
   public int palab(String pal) {
       int np=0,n,i;
       char x;
       n=pal.length();
	   for(i=n-1;i>0;i--) {
		   x=pal.charAt(i);
		   if(x==' ') {
			   np++;
		   }
	   }
	   return np+1;
   }
}
