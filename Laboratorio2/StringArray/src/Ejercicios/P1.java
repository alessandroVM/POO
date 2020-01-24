package Ejercicios;
import javax.swing.JOptionPane;
public class P1 {

   public static void main (String args[]) {
	   String pal;
		String texA=" ";
		String texB=" ";
		String texC=" ";
	   P1 texto = new P1();
	   texA= JOptionPane.showInputDialog("Ingrese la palabra 1 = ");
	   texB= JOptionPane.showInputDialog("Ingrese la palabra 2 = ");
	   texC= JOptionPane.showInputDialog("Ingrese la palabra 3 = ");
	   pal=texto.concat(texA, texB, texC);
	   System.out.println(pal);
   }
   public String concat(String tex1, String tex2,String tex3) {
	   String textF;
	   textF=tex1.concat(" ");
	   textF=textF.concat(tex2);
	   textF=textF.concat(" ");
	   textF=textF.concat(tex3);
	   return textF;
   }
}
