
import javax.swing.JOptionPane;

public class p6 {

	public static void main(String args[]) {
		int nac,edad,d;
		nac= Integer.parseInt(JOptionPane.showInputDialog("Anio de nacimiento (DD0A): "));		
	    edad= Integer.parseInt(JOptionPane.showInputDialog("Edad: "));	
		
	    d=((nac*2)+5)*50+edad+365-615;
		
		System.out.println("RESULTADO: " +d);
		
	}
}