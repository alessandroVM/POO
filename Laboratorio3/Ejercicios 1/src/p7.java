
import javax.swing.JOptionPane;

public class p7 {

	public static void main(String args[]) {
		int n;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
		
	    if(n%2==0) {
			System.out.println("El numero es par ");	    	
	    } else {
			System.out.println("El numero es impar ");
	    }
		
	}
}