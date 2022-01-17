import paquetes.Ejercicio1_14;
import paquetes.Ejercicio20_28;

public class Ejercicio51 {
  public static void main(String[] args) throws Exception {

    String frase = "", frase1 = "", frase2 = "";

    int[] arrayPrimoCapi = Ejercicio20_28.generaArrayInt(10, 100, 2);

    System.out.println("Array Generado: ");
    Ejercicio20_28.muestraArray(arrayPrimoCapi);

    for (int i = 0; i < arrayPrimoCapi.length ; i++){
      boolean num = Ejercicio1_14.esPrimo(arrayPrimoCapi[i]);
      boolean num2 = Ejercicio1_14.esCapicua(arrayPrimoCapi[i]);

      if (num == true){
       frase1 = "El " + arrayPrimoCapi[i] + " es primo y ";
      } else {
       frase1 = "El " + arrayPrimoCapi[i] + " no es primo y ";
      }

      if (num2 == true){
       frase2 = "es capicua.";
      } else {
       frase2 = "no es capicua.";
      }

     frase = frase1 + frase2;

     System.out.println(frase);

    }

  }
}
