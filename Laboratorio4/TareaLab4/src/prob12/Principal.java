package prob12;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int opc;
		double lado1,lado2,lado3,pi=Math.PI,radio;
		
	     Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("1.Cuadrado");
			System.out.println("2.Rectangulo");
			System.out.println("3.Triangulo");
			System.out.println("4.Circulo");
			System.out.println("Digite una opcion");
			opc=entrada.nextInt();
		switch(opc) {
		case 1: System.out.println("lado1");
		       lado1=entrada.nextDouble();
		       System.out.println("lado2");
		       lado2=entrada.nextDouble();
		       Cuadrado cu = new Cuadrado(lado1,lado2);
		       System.out.println("Area "+cu.area());
			break;
		case 2:System.out.println("lado1");
	           lado1=entrada.nextDouble();
	           System.out.println("lado2");
	           lado2=entrada.nextDouble();
	           Rectangulo rec = new Rectangulo(lado1,lado2);
		       System.out.println("Area "+rec.area());
	           break;
		case 3:System.out.println("lado1: ");
               lado1=entrada.nextDouble();
               System.out.println("lado2: ");
               lado2=entrada.nextDouble();
               System.out.println("lado3: ");
               lado3=entrada.nextDouble();
               Triangulo tri = new Triangulo(lado1,lado2,lado3);
		       System.out.println("Area "+tri.area());
			break;
		case 4:System.out.println("Radio: ");
		       radio=entrada.nextDouble();
		       Circulo cir = new Circulo(radio);
		       System.out.println("Area "+cir.area());
			break;
		}
		}while(opc>1 | opc<4);
	}
}