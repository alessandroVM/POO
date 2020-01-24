package Ejercicios;
import javax.swing.JOptionPane;
public class P9 {

   public static void main (String args[]) {
	   String pal;
	   String palx;
	   P9 texto = new P9();
	   pal= JOptionPane.showInputDialog("Ingrese la palabra a encriptar = ");
	   palx=texto.encrip(pal);
	   System.out.println("Palabra desencriptada: "+ pal);
	   System.out.println("Palabra encriptada: "+ palx);
   }
   public String encrip(String pal) {
	   String palx="";
       int n,i;
       char x;
       n=pal.length();
	   for(i=0;i<n;i++) {
		   x=pal.charAt(i);
		   if(x=='a' | x=='e' | x=='i' |x=='o' |x=='u') {
			   switch(x) {
			   case 'a':x='4';
			   break;
			   case 'e':x='3';
			   break;
			   case 'i':x='1';
			   break;
			   case 'o':x='0';
			   break;
			   case 'u':x='8';
			   break;
			   }
			   palx=palx+x;
		   }else {
			   palx=palx+x;
		   }
	   }
	   return palx;
   }
}
