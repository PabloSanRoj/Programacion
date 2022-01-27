package paquetes;

public class Terminal {
  
  String numero;
  int contador;

  public Terminal (String n){
    this.numero = n;
    this.contador = 0;
  }

  public void llama (Terminal t, int tiempo){
    this.contador += tiempo;
    t.contador += tiempo;
  }

  public String toString() {
    String resultado = "";

    resultado += "Numero " + this.numero + " - " + this.contador + "s de conversacion";

    return resultado;
  }

}
