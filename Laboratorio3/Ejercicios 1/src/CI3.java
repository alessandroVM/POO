//3. Elabore un programa para determinar si un numero es primo. Como salida solo mostrar el mensaje "Es primo"
//si lo es o "No es primo" en caso no lo sea.
import javax.swing.JOptionPane;

public class CI3 {

	public static void main(String args[]) {
		int n,e=0;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        for(int i=2;i<n;i++) {
        	if(n%i==0) {
        		e++;
        	}
        }
        if(e==0) {
        	System.out.println("El numero es primo");
        }else {
        	System.out.println("El numero no es primo");
        }
	}
}