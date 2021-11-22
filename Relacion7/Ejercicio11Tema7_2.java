/* Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */

public class Ejercicio11Tema7_2 {
  public static void main(String[] args) {
    
    int max = 200, min = 300, med = 0;
    
    int [][] num = new int [10][10];

    for (int i = 0 ; i < 10 ; i++){
      for (int j = 0 ; j < 10 ; j++){
        num[i][j] = (int)((Math.random()*101)+200);
      }
    }

    for (int i = 0 ; i < 10 ; i++){
      System.out.print("Índice " + i + ": ");
      for (int j = 0 ; j < 10 ; j++){
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }

    int j = 0;
    System.out.println();
    for (int i = 0 ; i < 10 ; i++){
      System.out.print(num[i][j] + " ");
      if (num[i][j] > max){
        max = num[i][j];
      }
      if (num[i][j] < min){
        min = num[i][j];
      }
      med = med + num[i][j];
      j++;
    }
    med /= 10;

    System.out.println();
    System.out.println("La media es: " + med);
    System.out.println("El mayor es: " + max);
    System.out.println("El menor es: " + min);
  }
}
