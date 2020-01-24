
import javax.swing.JOptionPane;

public class p11 {

	public static void main(String args[]) {
		int a,b,c;
		a= Integer.parseInt(JOptionPane.showInputDialog("Digite a: "));
		b= Integer.parseInt(JOptionPane.showInputDialog("Digite b: "));
		c= Integer.parseInt(JOptionPane.showInputDialog("Digite c: "));
		
	    if(a>Math.abs(b-c) & a<b+c) {
	    	System.out.println("Los valores forman un triangulo  ");
	    } else {
	    	if(b>Math.abs(a-c) & b<a+c) {
	    		System.out.println("Los valores forman un triangulo  ");		
	    	} else {
	    		if(c>Math.abs(b-a) & c<b+a) {
	    			System.out.println("Los valores forman un triangulo  ");			
	    		} else {
	    			System.out.println("Los valores no forman un triangulo  ");
	    		}
	    	}
	    }
		
	}
}