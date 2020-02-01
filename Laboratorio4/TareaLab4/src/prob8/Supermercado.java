package prob8;

public class Supermercado {
 protected String tipoProduct;
 
 public Supermercado(String tipoProduct) {
	 this.tipoProduct= tipoProduct;
}
 
 public String getTipoProduct() {
	 return tipoProduct;
 }
@Override
public String toString() {
	return "tipo de Producto="+tipoProduct;
}
 
 
}