/* Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. */

public class Ejercicio8Tema7_1 {
  public static void main(String[] args) {

    int[] num = new int[13];

    for (int i = 1; i <= 12; i++) {
      System.out.print("Introduzca la temperatura media del mes " + i + ": ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    for (int i = 1; i <= 12; i++) {
      if (i == 10 || i == 11 || i == 12) {
        System.out.print("Mes " + i + " | ");
      } else {
        System.out.print("Mes " + i + "  | ");
      }
      for (int j = 0; j < num[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
