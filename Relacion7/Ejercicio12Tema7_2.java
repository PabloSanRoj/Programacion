/* Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.*/

public class Ejercicio12Tema7_2 {
  public static void main(String[] args) {

    int max = 500, min = 900, med = 0;
    
    int [][] num = new int [9][9];

    for (int i = 0 ; i < 9 ; i++){
      for (int j = 0 ; j < 9 ; j++){
        num[i][j] = (int)((Math.random()*401)+500);
      }
    }

    for (int i = 0 ; i < 9 ; i++){
      System.out.print("Índice " + i + ": ");
      for (int j = 0 ; j < 9 ; j++){
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }

    int j = 0;
    System.out.println();
    for (int i = 8 ; i >= 0 ; i--){
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
    med /= 9;

    System.out.println();
    System.out.println("La media es: " + med);
    System.out.println("El mayor es: " + max);
    System.out.println("El menor es: " + min);
  }
}
