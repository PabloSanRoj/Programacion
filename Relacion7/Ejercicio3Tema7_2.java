/* Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).*/

public class Ejercicio3Tema7_2 {
  public static void main(String[] args) {
    
    int [][] num = new int [4][5];
    int [] suma = new int [4];
    int [] suma2 = new int [5];

    System.out.println();
    System.out.println("Introduce números: ");
    for (int i = 0 ; i < 4 ; i++){
      for (int j = 0 ; j < 5 ; j++){
        num[i][j] = (int)((Math.random()*801)+100);
        System.out.println("Indice " + i + " Columna " + j + ": " + num[i][j]);
      }
    }

    System.out.println();
    System.out.println("La suma de las columnas: ");
    for (int i = 0 ; i < 4 ; i++){
      for (int j = 0 ; j < 5 ; j++){
        suma[i] = suma[i] + num[i][j];
      }
      System.out.println("Fila " + i + ": " + suma[i]);
    }
    System.out.println();
    System.out.println("La suma de las filas en cada columna: ");
    for (int j = 0 ; j < 5 ; j++){
      for (int i = 0 ; i < 4 ; i++){
        suma2[j] = suma2[j] + num[i][j];
      }
      System.out.println("Columna " + j + ": " + suma2[j]);
    }
  }
}
