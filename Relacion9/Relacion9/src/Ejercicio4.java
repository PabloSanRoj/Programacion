import paquetes.Fraccion;

public class Ejercicio4 {
  public static void main(String[] args) {
    Fraccion Fraccion1;
    Fraccion Fraccion2;

    Fraccion1 = new Fraccion(768, 832);
    Fraccion2 = new Fraccion(200, 872);

    System.out.println();
    System.out.print(Fraccion1);
    System.out.println();
    Fraccion1.Invierte();
    System.out.println();
    System.out.print(Fraccion1);
    Fraccion1.multiplica(Fraccion2);
    System.out.println();
    Fraccion1.divide(Fraccion2);
    System.out.println();
    System.out.print(Fraccion1.simplifica());
    System.out.println();
  }
}
