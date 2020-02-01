package prob12;

public abstract class Figura {
  int nLados;

public Figura(int nLados) {
	this.nLados = nLados;
}

public int getnLados() {
	return nLados;
}

public void setnLados(int nLados) {
	this.nLados = nLados;
}
  public abstract double area();
}
