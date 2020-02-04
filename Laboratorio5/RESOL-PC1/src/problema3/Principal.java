package problema3;

public class Principal {
   public static void main(String[] args) {
	   double x=1.0;
	   double y=0.0;
	   double z=2.0;
	   boolean w= x*y < z/x || x / y > z * x && z* y <x && (++y< x || --z > y);
	   System.out.println("El valor de w es: "+w);
   }
}
