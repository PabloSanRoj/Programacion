/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */

public class Ejercicio10Tema7_1 {
  public static void main(String[] args) {

    int[] num = new int[20];
    int[] num2 = new int[20];

    for (int i = 0; i < 20; i++) {
      num[i] = (int) (Math.random() * 101);
    }
    System.out.println();
    System.out.println("Los números son los siguientes: ");
    System.out.println();
    for (int z = 0; z < 20; z++) {
      System.out.println(z + " = " + num[z]);
    }
    for (int i = 0; i < 20; i++) {
      num2[i] = 0;
    }
    int j = 0;
    for (int i = 0; i < 20; i++) {
      if (num[i] % 2 == 0) {
        num2[j] = num[i];
        j++;
      }
    }
    for (int i = 0; i < 20; i++) {
      if (num[i] % 2 != 0) {
        num2[j] = num[i];
        j++;
      }
    }
    System.out.println("Los números ordenados primero por par luego impar son: ");
    System.out.println();
    for (int k = 0 ; k < 20 ; k++){
      System.out.println(k + " = " + num2[k]);
    }
    System.out.println();
  }
}
