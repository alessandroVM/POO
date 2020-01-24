
import javax.swing.JOptionPane;

public class p3 {

	public static void main(String args[]) {
		int a;
		int b;
		int aux;
		a= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));		
		b= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));	
		aux=a;
		a=b;
		b=aux;
		
		System.out.println("El valor a es: " +a);
		System.out.println("El valor b es: " +b);
		
	}
}