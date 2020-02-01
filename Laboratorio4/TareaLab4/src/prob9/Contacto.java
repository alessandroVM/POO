package prob9;

public class Contacto {
  private String nomb,direcc;
  private int num;
  
public Contacto(String nomb, String direcc, int num) {
	this.nomb = nomb;
	this.direcc = direcc;
	this.num = num;
}

public String getNomb() {
	return nomb;
}
public void setNomb(String nomb) {
	this.nomb = nomb;
}
public String getDirecc() {
	return direcc;
}
public void setDirecc(String direcc) {
	this.direcc = direcc;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
  

}
