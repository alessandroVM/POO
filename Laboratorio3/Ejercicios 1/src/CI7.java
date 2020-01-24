/*
 * 7. Elabore un programa que permita determinar si un numero entero es capicua. 
 * Un numero es capicua si al escribirlo en orden inverso da el mismo numero 
 * es decir 1221 con cifras invertidas es 1221.
 */
import javax.swing.JOptionPane;
public class CI7 {

	public static void main(String args[]) {
		int n,temp=0,e,o;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        o=n;
		do {
        	e=n%10;
        	n=n/10;
           	temp=temp*10;
        	temp=temp+e;        	
        }while(n>0);
        System.out.println("Inverso del numero =  "+temp);
        if(temp==o) {
        	System.out.println("EL numero es capicua ");
        }else {
        	System.out.println("EL numero no es capicua ");        	
        }
	}
}
