/*
 * 5. Elabore un programa para determinar la cantidad de digitos tiene un numero entero.
 */
import javax.swing.JOptionPane;
public class CI5 {

	public static void main(String args[]) {
		int n,cif=0;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        do {
        	n=n/10;
        	cif++;
        }while(n>0);
        System.out.println("Cantidad de cifras del numero= "+cif);
	}
}