/*
 * 6. Extendiendo el problema anterior, ahora se le pide mostrar 
 * tambien cuantos digitos pares tiene el numero ingresado
 */
import javax.swing.JOptionPane;
public class CI6 {

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