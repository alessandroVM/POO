package prob10;

import java.util.Scanner;

public class Persona {
   private String nomb;
   private String direcc;
   private int telf;
   Scanner entrada = new Scanner(System.in);
public Persona(String nomb, String direcc, int telf) {
	this.nomb = nomb;
	this.direcc = direcc;
	this.telf = telf;
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
public int getTelf() {
	return telf;
}
public void setTelf(int telf) {
	this.telf = telf;
}
   
}
