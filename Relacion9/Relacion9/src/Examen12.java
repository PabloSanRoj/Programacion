import paquetes.Examen1.Baraja;
import paquetes.Examen1.Carta;

public class Examen12 {
  public static void main(String[] args) {

    Baraja b1 = new Baraja();
    Baraja b2 = new Baraja();
    Carta c1 = new Carta ("C", "A");
    Carta c2 = new Carta ("C", "2");
    System.out.println(b1);
    b2.dameCarta();
    System.out.println(b1);
    System.out.println(b2);
  }
}