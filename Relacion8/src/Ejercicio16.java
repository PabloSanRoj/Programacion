import paquetes.Ejercicio1_14;

public class Ejercicio16 {
  public static void main(String[] args) throws Exception {

    boolean num;
    System.out.println();
    System.out.println("Los numeros capicua entre 1 y 99999 son: ");
    for (int i = 1 ; i <= 99999 ; i++){

      num = Ejercicio1_14.esCapicua(i);

      if (num == true){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}