
import javax.swing.JOptionPane;

public class p4 {

	public static void main(String args[]) {
		double x1,x2;
		double y1,y2;
		double d;
		x1= Integer.parseInt(JOptionPane.showInputDialog("Abcisa del punto 1: "));		
		y1= Integer.parseInt(JOptionPane.showInputDialog("Ordenada del punto 1: "));	
		x2= Integer.parseInt(JOptionPane.showInputDialog("Abcisa del punto 2: "));		
		y2= Integer.parseInt(JOptionPane.showInputDialog("Abcisa del punto 2: "));	
		
	    d=Math.sqrt((x1-x2)*(x1-x2)+ (y1-y2)*(y1-y2));
		
		System.out.println("El valor de la distancia es: " +d);
		
	}
}