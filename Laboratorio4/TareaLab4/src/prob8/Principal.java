
package prob8;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  static ArrayList<Producto> articulo = new ArrayList<Producto>();
  static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		pedido();
		mostrar();
	}
	
	public static void pedido() {
		int precio,stock;
		char resp;
        String tip;
		do {	
		System.out.println("Tipo de producto");
		tip=entrada.nextLine();
		System.out.println("Precio");
	    precio=entrada.nextInt();
	    System.out.println("Stock");
	    stock=entrada.nextInt();
		Producto product = new Producto(tip,precio,stock);
	    articulo.add(product);
	    System.out.println("Desea continuar?");
        resp=entrada.next().charAt(0);
	}while(resp=='S' || resp=='s');
	}
	public static void mostrar() {
		for (Producto pro: articulo) {
			System.out.println(pro.toString());
		}
	}
}