//2. Factorizar un numero ingresado por teclado. Por ejemplo 12=2x2x3, 27=3x3x3.

import javax.swing.JOptionPane;

public class CI2 {

	public static void main(String args[]) {
		int n,o,i=1;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a factorizar: "));
		o=n;
        while(i<o) {
        	i++;
        	if(n%i==0) {
        		n=n/i;
                System.out.println(+i);
                i=1;
        	}
        }
	}
}