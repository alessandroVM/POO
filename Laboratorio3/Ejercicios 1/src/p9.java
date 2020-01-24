
import javax.swing.JOptionPane;

public class p9 {

	public static void main(String args[]) {
		int i,j,aux;
		
		int[] vector = new int[2];

	    for(i=0;i<2;i++) {
	    	vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
	    }
	    	
		for(i=0; i<2;i++) {
			for(j=0; j<2;i++) {
				if(vector[i]<vector[j]) {
					aux=vector[i];
					vector[i]=vector[j];
					vector[j]=aux;
				}
			}
		}
		
		System.out.println("Numero intermedio= "+vector[2]);
	}
}