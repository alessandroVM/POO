package problema6;

public class principal {
	public static void main(String[] args) {
		calcularXYZ();
	}
	
	public static void calcularXYZ() {
		int y=12,z=-4,w=0,x;
		for(x=0;x<9;x=x+3) {
			while(w<3){
				y=z+w++;
				}
			if(x%2==0)
				y=z+x;
			else
				y++;
			z++;
			}
		System.out.print("[X = " + x + " Y = " + y + " Z =" + z + " W = " +w);	
	}
}
