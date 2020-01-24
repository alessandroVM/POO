
import javax.swing.JOptionPane;

public class p1 {

	public static void main(String args[]) {
		double radio;
		double altura;
		double area;
		double pi=3.1416;
		
		radio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio: "));	
		altura= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: "));			
		area=radio*radio*altura*pi;
		
		System.out.println("El valor del area es: " +area);
		
	}
}
