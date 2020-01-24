//Calcule los divisores comunes de dos numeros. Por ejemplo los divisores de 36 y 54 son 2, 3 y 9.

import javax.swing.JOptionPane;

public class CI1 {

	public static void main(String args[]) {
		int a,b,c,d;
		a= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1: "));
		b= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2: "));
		c= Math.min(a, b);
		d= Math.max(a, b);
		for(int i=2;i<=c;i++) {
			if(d%i==0 & c%i==0) {
				System.out.println(+i);
				d=d/i;
			}
		}
		
	}
}