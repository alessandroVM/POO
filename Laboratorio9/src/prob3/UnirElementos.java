package prob3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnirElementos {
	int num;
  public static void main(String args[]) {
	  Set<Integer> A= new HashSet<>();
	  Set<Integer> B= new HashSet<>();
	  Set<Integer> C= new HashSet<>();
	  Scanner tlc = new Scanner(System.in);
	  System.out.println("Tamaño del conjunto A");
	  int tam1 = tlc.nextInt();
	  System.out.println("Tamaño del conjunto B");
	  int tam2 = tlc.nextInt();
	  System.out.println("Elementos de A");
	  for(int i=0;i<tam1;i++) {
		  int num = tlc.nextInt();
		  A.add(num);
	  }
	  System.out.println("Elementos de B");
	  for(int i=0;i<tam2;i++) {
		  int num = tlc.nextInt();
		  B.add(num);
	  }
	  int i=0,j=0;
	  while(i<tam1 || j<tam2) {
		  if((int)A.toArray()[i]<(int)B.toArray()[j]) {
			  C.add((int)A.toArray()[i]);
			  i++;  
		  }else {
			  C.add((int)B.toArray()[j]);
			  j++;
		  }
		  if(i==tam1) {
			  for(int e=j;e<tam2;e++) {
				  C.add((int)B.toArray()[e]);
			  } j=tam2;
		  }
		  if(j==tam2) {
			  for(int e=i;e<tam1;e++) {
				  C.add((int)A.toArray()[e]);
			  } i=tam1;
		  }
	  }
	  System.out.print(C);
  }
}