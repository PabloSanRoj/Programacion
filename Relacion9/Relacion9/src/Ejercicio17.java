import paquetes.Piramide;
import paquetes.Rectangulo;

public class Ejercicio17 {
  public static void main(String[] args) {

    Piramide p;
    Rectangulo r1;
    Rectangulo r2;

    p = new Piramide(4);
    r1 = new Rectangulo(4, 3);
    r2 = new Rectangulo(6, 2);

    System.out.println(p);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println("Pirámides creadas: " + Piramide.piramidesCreadas());
    System.out.println("Rectángulos creados: " + Rectangulo.rectangulosCreados());
  }
}
