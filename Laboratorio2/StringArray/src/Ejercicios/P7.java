package Ejercicios;
import javax.swing.JOptionPane;
public class P7 {

   public static void main (String args[]) {
	   int[] arreglo = new int[7];
	   int [] voc = new int[100];
	   int f;
	   P7 array = new P7();
	   for(int i=0;i<6;i++) {
	   arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero = "));
	   }
	   f=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de ampliacion = "));
	   voc=array.ampliarArray(arreglo, f);
	   System.out.println("Nuevo arreglo "+ voc);  
   }
   public static int[] ampliarArray(int[] A, int factor) {
       int[] newArray = new int[factor];
       for(int i=0;i<5;i++) {
    	   newArray[i]=A[i];
       }
	  return newArray;
   }
}
