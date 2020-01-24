
import javax.swing.JOptionPane;

public class p10 {

	public static void main(String args[]) {
		int m,n,q;
		m= Integer.parseInt(JOptionPane.showInputDialog("Digite m: "));
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite n: "));
		q= Integer.parseInt(JOptionPane.showInputDialog("Digite q: "));
		
	    if(n%m==0 & q%m==0) {
	    	System.out.println("M es multiplo de n y q ");
	    } else {
	    	System.out.println("M no es multiplo de n y q ");
	    }
		
	}
}