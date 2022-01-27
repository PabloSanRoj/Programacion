import paquetes.Tiempo;

public class Ejercicio6 {
  public static void main(String[] args) {
    Tiempo p1 = new Tiempo(0, 20, 30);
    p1.suma();
    System.out.print(p1);
    Tiempo p2 = new Tiempo(0, 30, 40);
    p2.suma();
    System.out.print(p2);
    Tiempo p3 = new Tiempo(0, 35, 20);
    p3.resta();
    System.out.print(p3);
    }
}