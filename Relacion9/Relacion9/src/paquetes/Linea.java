package paquetes;

public class Linea {

  Punto punto1;
  Punto punto2;

  public Linea(Punto punto1, Punto punto2) {
    this.punto1 = punto1;
    this.punto2 = punto2;
  }

  @Override
  public String toString() {
    return "Línea formada por los puntos " + punto1 + " y " + punto2;
  }

}
