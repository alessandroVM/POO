/*
 * 9. Ingresar un numero y mostrar la suma de cada una de sus cifras
 */
import javax.swing.JOptionPane;
public class CI9 {

	public static void main(String args[]) {
		int n,e=0,s=0;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		while(n>0) {
			e=n%10;
			n=n/10;
			s=s+e;
		}
		System.out.println("La suma de cifras es = "+s);   
	}
}