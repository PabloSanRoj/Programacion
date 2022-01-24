package paquetes;

public class Caballo {

  private String sexo;
  private String color;
  private int manchas;
  public int carrera;

  public static int numeroKilometros = 0;

  public static int numeroKilometros() {
    return numeroKilometros;
  }

  public int getcarrera() {
    return carrera;
  }

  public void Corre(int km) {
    carrera += km;
    numeroKilometros += km;
  }

  public Caballo(String s, String c, int m) {
    this.sexo = s;
    this.color = c;
    this.manchas = m;
    this.carrera = 0;
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
