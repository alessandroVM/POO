
import javax.swing.JOptionPane;

public class p2 {

	public static void main(String args[]) {
		int n;
		int sum;
		n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n: "));		
		
		sum=(n*(n+1))/2;
		sum=sum*sum;
		
		System.out.println("El valor de la sumatoria es: " +sum);
		
	}
}