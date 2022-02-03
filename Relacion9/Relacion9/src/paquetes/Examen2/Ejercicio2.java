package paquetes.Examen2;

public class Ejercicio2 {
  public static void main(String[] args){
    Complejo2 a = new Complejo2 (0, 0);
    Complejo2 b = new Complejo2 (-1, 5);
    Complejo2 c = new Complejo2 (4.2f, -3.68f);
    Complejo2 d = new Complejo2 (-11.11f, -22.22f);
    Complejo2 e = new Complejo2 (30, 0);

    Complejo2 c1 = a.adicion(b);
    Complejo2 c2 = c.adicion(d);
    Complejo2 c3 = c.multiplicacion(10f);
    Complejo2 c4 = c.multiplicacion(d);
    Complejo2 c5 = d.multiplicacion(e);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
  }
}
