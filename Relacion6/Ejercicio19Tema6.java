/* Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.*/

public class Ejercicio19Tema6 {
  public static void main(String[] args) {
    
    int num, media = 0, maxi = -100, mini = 200;

    for (int i = 0 ; i < 50 ; i++) {
      num = (int)((Math.random()*302)-101);
      System.out.print(num + " ");
      media += num;
      if (num > maxi && num % 2 == 0) {
        maxi = num;
      }
      if (num < mini && num % 2 != 0) {
        mini = num;
      }
    }
    media /= 50;
    System.out.println();
    System.out.println("La media es: " + media);
    System.out.println("El mayor número par es: " + maxi);
    System.out.println("El menor número impar es: " + mini);
  }
}
