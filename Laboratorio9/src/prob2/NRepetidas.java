package prob2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NRepetidas {

	public static void main(String[] args) {
		String fras;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite una frase");
        fras=entrada.nextLine();
        int pos1=fras.indexOf(" ");
        int pos2=0;
        int e=0,tam=0;
         Set<String> fr= new HashSet<>();
         fr.add(fras.substring(0,pos1));
         e++;
        while(fras.indexOf(" ",pos1+1) > 0) {
        	pos2=fras.indexOf(" ",pos1 + 1);
        	fr.add(fras.substring(pos1+1, pos2));
        	e++;
        
        	pos1=pos2;
        }
		fr.add(fras.substring(pos2+1));
		e++;
		tam=fr.size();
		System.out.println("Palabras repetidas: "+(e-tam));
        for(String palab: fr) {
        	System.out.print(palab + " ");
        }
	}
}