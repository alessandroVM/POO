
package prob8;

public class Producto extends Supermercado{
 private int precio;
 private int stock;
public Producto(String tipoProduct, int precio, int stock) {
	super(tipoProduct);
	this.precio = precio;
	this.stock = stock;
}
public int getPrecio() {
	return precio;
}
public int getStock() {
	return stock;
}
@Override
public String toString() {
	return "Producto"+super.toString() + "[precio =" + precio + ", stock=" + stock + "]";
}


}