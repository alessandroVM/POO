package problema4;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
		   Scanner entrada = new Scanner(System.in);
		   String cad;
		   int tam;
		   System.out.println("Digite la cadena: ");
		   cad=entrada.nextLine();
		   tam=cad.length();
		   char[] result = new char[tam];
		   result=converMin(cad);
		   System.out.print(result);
	   }
	 public static char[] converMin(String cad){
		 int min,may,tam,sw;
		   tam=cad.length();
		   char[] newcad = new char[tam];
			for(int i=0;i<tam;i++) {
				sw=0;
				min=97;
				may=65;
				while(min<=122 & may<=90) {
					char c =(char)(min);
					if(cad.charAt(i)==c) {
						c =(char)(may);
						newcad[i]=c;
						sw=1;
					}
					may++;
					min++;
				}
				if(sw==0) {
					newcad[i]=cad.charAt(i);
				}
			}
			return newcad;
		 }
}
