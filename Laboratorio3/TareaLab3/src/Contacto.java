public class Contacto {
    String nomb;
    int edad;
    double salario;

    public Contacto(String nomb,int edad,double salario){
        this.nomb= nomb;
        this.edad = edad;
        this.salario= salario;
    }
    public void setNomb(String nomb){
        this.nomb = nomb;
       
    }
    public String getNomb(){
        return nomb;
    }
    public void setSalario(String nomb){
        this.salario = salario;
        
    }
    public double getSalario(){
        return salario;
    }
    public int getEdad(){
        return edad;
    }
}
