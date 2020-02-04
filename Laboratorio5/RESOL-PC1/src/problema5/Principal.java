package problema5;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
		 int t,n;
		 Scanner entrada= new Scanner(System.in);
		 System.out.println("Digite el tamaño del conjunto 1: ");
		 t=entrada.nextInt();
		 System.out.println("Digite el tamaño del conjunto 2: ");
		 n=entrada.nextInt();
		 int[] A=new int[t];
		 int[] B=new int[n];
		 System.out.println("Digite los elementos del conjunto 1: ");
		 for(int i=0;i<t;i++) {
			 System.out.print("\nElemento["+(i+1)+"] = ");
			 A[i]=entrada.nextInt();
		 }
		 System.out.println("Digite los elementos del conjunto 2: ");
		 for(int i=0;i<n;i++) {
			 System.out.print("\nElemento["+(i+1)+"] = ");
			 B[i]=entrada.nextInt();
		 }
		 union(A,B);
	 }
	 
	 public static void union(int[] A,int[] B) {
		 int t1,t2,e=0;
		 t1=A.length;
		 t2=B.length;
		 int[] aux= new int[t1+t2];
		 for(int i=0;i<t1;i++) {
			 aux[i]=A[i];
		 }
		 for(int i=0;i<t2;i++) {
			 aux[i+t1]=B[i];
		 }
		 for(int i=0;i<aux.length;i++) {
			 for(int f=i+1;f<aux.length;f++) {
				 if(aux[i]==aux[f]) {
					 aux[f]=0;
				 }
			 }
		 }
		 for(int i=0;i<aux.length;i++) {
			 for(int f=i+1;f<aux.length;f++) {
				 if(aux[i]>aux[f]) {
					 int temp=aux[i];
					 aux[i]=aux[f];
					 aux[f]=temp;
					 
				 }
			 }
		 }
		for(e=0;e<aux.length;e++) {
			if(aux[e]!=0) {
				System.out.print(aux[e]);
			}
		}
 }
	 
}