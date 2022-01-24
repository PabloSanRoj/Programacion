package paquetes;

public class Caballo {
  String sexo;
  String color;
  int manchas;

  public Caballo(String s, String c, int m) {
    this.sexo = s;
    this.color = c;
    this.manchas = m;
  }

  public String Sexo() {
    return this.sexo;
  }

  public String color() {
    return this.color;
  }

  public int manchas() {
    return this.manchas;
  }

  public String toString() {
    String resultado = "";

    resultado += "Sexo: " + this.sexo + "\n";
    resultado += "Color: " + this.color + "\n";

    if (this.manchas > 0) {
      resultado += "Manchas: " + this.manchas;
    } else {
      resultado += "Manchas: Este caballo no tiene manchas";
    }
    return resultado;
  }
}
