/*
 * 4. Elabore un programa para determinar si un numero es perfecto. Un numero es perfecto si la suma de sus
divisores es igual al numero, por ejemplo 6 tiene como divisores a 1, 2 y 3 y como 1+2+3=6, por lo tanto, 6 es
un numero perfecto.
 */
import javax.swing.JOptionPane;

public class CI4 {

	public static void main(String args[]) {
		int n,temp,s=0;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        temp=n;
		for(int i=1;i<temp;i++) {
			if(n%i==0) {
				s=s+i;
				n=n/i;
			}
		}
		if(s==temp) {
			System.out.println("El numero es perfecto");
		}else {
			System.out.println("El numero no es perfecto");
		}
	}
}