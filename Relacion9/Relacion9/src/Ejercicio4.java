import paquetes.Fraccion;

public class Ejercicio4 {
  public static void main(String[] args) {
    Fraccion Fraccion1;

    Fraccion1 = new Fraccion(768, 832);

    System.out.print(Fraccion1.toString());
    System.out.println();
    System.out.print(Fraccion1.Invierte());
    System.out.println();
    System.out.print(Fraccion1.multiplica());
    System.out.println();
    System.out.print(Fraccion1.divide());
    System.out.println();
    System.out.print(Fraccion1.simplifica());
    System.out.println();
  }
}
