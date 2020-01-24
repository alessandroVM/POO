
import javax.swing.JOptionPane;

public class p8 {

	public static void main(String args[]) {
		int a,b,p,s;
		a= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
		b= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
		
	    if(a>0 || b>0) {
	    	p=a*b;
			System.out.println("Producto= "+p);	    	
	    } else {
	    	s=a+b;
			System.out.println("Suma= "+s);
	    }
		
	}
}