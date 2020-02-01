package prob12;

public class Circulo extends Figura{
  double radio,pi=Math.PI;

public Circulo(double radio) {
	super(0);
	this.radio = radio;
}

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}
  public double area() {
	  return pi*Math.pow(radio, 2);
  }
}
