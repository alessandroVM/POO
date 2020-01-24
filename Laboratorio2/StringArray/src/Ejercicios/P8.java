package Ejercicios;
import javax.swing.JOptionPane;
public class P8 {

   public static void main (String args[]) {
	   int[] arreglo = new int[100];
	   P8 array = new P8();
	   int tam;
	   tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamanio del vector = "));
	   for(int i=0;i<tam;i++) {
	   arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero = "));
	   }
	   array.ImprArray(arreglo, tam);
   }
   public static void ImprArray(int[] A, int n) {
	   System.out.println("Nuevo arreglo ");
       for(int i=0;i<n;i++) {
    	   System.out.println(A[i]);
       }
   }
}
