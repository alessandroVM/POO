package Ejercicios;
import javax.swing.JOptionPane;
public class P10 {

   public static void main (String args[]) {
	   P10 cuenta = new P10();
	   String login, clave;
	   login=JOptionPane.showInputDialog("Usuario = ");
	   clave=JOptionPane.showInputDialog("Clave =");
	   cuenta.registro(login, clave);
   }
   public void registro(String log, String clav) {
	   String login="admin",clave="4dm1n";
	   if(log.compareTo(login)==0 & clav.compareTo(clave)==0) {
		   System.out.println("Usuario Identificado");
	   }else {
		   System.out.println("Usuario no Identificado");
	   }
   }
}
