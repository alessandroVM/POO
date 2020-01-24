
import javax.swing.JOptionPane;
public class p5 {

	public static void main(String args[]) {
		float ang= Float.parseFloat(JOptionPane.showInputDialog("Digite el angulo a convertir: "));	
		String st=ang+"";
		int ind=st.indexOf("."),a;
		float g=0,m=0,s=0;
		
	    ang=(float) ((ang*180)/3.1416);
		
	    a=Integer.parseInt(st.substring(0, ind));
	    g=a;
	    ang=ang-g;
		m=ang*60;
		s=m%60;
		
		System.out.println("Grados: " +g);
		System.out.println("Minutos: " +m);
		System.out.println("Segundos: " +s);
		
	}
}