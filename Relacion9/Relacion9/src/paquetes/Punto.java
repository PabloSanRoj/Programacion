package paquetes;

public class Punto {
  double x;
  double y;

  public Punto(double cox, double coy) {
    this.x = cox;
    this.y = coy;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
