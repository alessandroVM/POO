package Ejercicios;
import javax.swing.JOptionPane;
public class P5 {

   public static void main (String args[]) {
	   String pal;
	   int voc;
	   P5 texto = new P5();
	   pal= JOptionPane.showInputDialog("Ingrese la palabra = ");
	   voc=texto.vocal(pal);
	   System.out.println("Palabra: "+ pal);
	   System.out.println("Numero de vocales "+ voc);
   }
   public int vocal(String pal) {
       int vocal=0,n,i,na=0,ne=0,ni=0,no=0,nu=0;
       char x;
       n=pal.length();
	   for(i=0;i<n;i++) {
		   x=pal.charAt(i);
		   if(x=='a' | x=='e' | x=='i' |x=='o' |x=='u') {
			   switch(x) {
			   case 'a': na++;
			   if(na==1)
				   vocal++;
				   break;
			   case 'e':ne++;
			   if(ne==1)
				   vocal++;
				   break;
			   case 'i':ni++;
			   if(ni==1)
				   vocal++;
				   break;
			   case 'o':no++;
			   if(no==1)
				   vocal++;
				   break;
			   case 'u':nu++;
			   if(nu==1)
				   vocal++;
				   break;
			   }
		   }
	   }
	   return vocal;
   }
}
