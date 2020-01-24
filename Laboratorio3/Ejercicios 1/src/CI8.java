/*
 * 8. Ingresado el numero de terminos de la serie, 
 * mostrar la suma de la serie. 1, 2, 2, 4, 3, 6, 4, 8, 5, 10, ...
 */
import javax.swing.JOptionPane;
public class CI8 {
	public static void main(String args[]) {
		int n,s1=0,s2=0,i,st=0;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamanio de la serie: "));
        if(n%2==0) {
        	for(i=2;i<=n;i=+2) {
        		s2=s2+i;
        	}
        	for(i=1;i<=n/2;i++) {
        		s1=s1+i;
        	}
            st=s1+s2;
            System.out.println("La suma de la serie es = "+st);   
        }else {
        	for(i=1;i<=(n+1)/2;i++) {
        		s1=s1+i;
        	}
        	for(i=2;i<=n-1;i=+2) {
        		s2=s2+i;
        	}
            st=s1+s2;
            System.out.println("La suma de la serie es = "+st);   
        }
	}
}