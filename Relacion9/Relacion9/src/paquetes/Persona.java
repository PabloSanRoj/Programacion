package paquetes;

public class Persona {
  
  private String DNI;
  private String Nombre;

  public Persona ( String d, String N){
    this.DNI = d;
    this.Nombre = N;
  }

  public String getDNI (){
    return this.DNI;
  }

  public String toString() {
    String resultado = "";

      resultado += this.DNI + "\n";
      resultado += this.Nombre + "\n";

    return resultado;
  }
}
