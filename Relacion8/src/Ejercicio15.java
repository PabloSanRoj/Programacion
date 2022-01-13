import paquetes.Ejercicio1_14;

public class Ejercicio15 {
  public static void main(String[] args) throws Exception {

    boolean num;
    System.out.println();
    System.out.println("Los numeros primos entre 1 y 100 son: ");
    for (int i = 1 ; i <= 1000 ; i++){

      num = Ejercicio1_14.esPrimo(i);

      if (num == true){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
