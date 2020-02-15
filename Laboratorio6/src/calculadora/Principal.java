package calculadora;

import java.util.Scanner;

public class Principal {
   public static void main(String args[]) {
	   String oper,A,B;
	   int num1,num2,result;
	   Scanner tec = new Scanner(System.in);
	   System.out.println("Ingrese la operacion ");
	   oper =tec.next();
	   try {
		   A= String.valueOf(oper.charAt(0));
		   B=String.valueOf(oper.charAt(2));
		   num1=Integer.parseInt(A);
		   num2=Integer.parseInt(B);

	   switch(oper.charAt(1)) {
	   case '+' :  result=num1 + num2;
	    System.out.println(result);
		   break;
	   case '-' : result=num1 - num2;
	    System.out.println(result);
		   break;
	   case '/' : result=num1 / num2;
	    System.out.println(result);
		   break;
	   case '*' : result=num1 * num2;
	    System.out.println(result);
		   break;
	   }
	   } catch (NumberFormatException e) {
		   System.out.print("Operador incorrecto");
	   }
   }
}