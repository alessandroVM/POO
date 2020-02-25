package prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frase {
 
     public static void main(String[] args) {
         int tam;
         String fras;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite una frase");
        fras=entrada.nextLine();
        int pos1=fras.indexOf(" ");
        int pos2=0;
         List<String> fr= new ArrayList<String>();
         fr.add(fras.substring(0,pos1));
        while(fras.indexOf(" ",pos1+1) > 0) {
        	pos2=fras.indexOf(" ",pos1 + 1);
        	fr.add(fras.substring(pos1, pos2));
        	if(pos1==pos2) {
        		fr.add(fras.substring(pos2));
        		break;
        	}
        	pos1=pos2;
        }
		fr.add(fras.substring(pos2));
       // System.out.println(" " + fr.toString());
    	for(int i=fr.size()-1;i>=0;i--) {
    		 String k =fr.get(i);
        	 System.out.print(k +" ");
    	}
    }
}


