/* Modifica el programa anterior de tal forma que no se repita ningún número en
el array. */

public class Ejercicio6Tema7_2 {
  public static void main(String[] args) {

    int max = 0;
    boolean repetido;

    int[][] num = new int[6][10];

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        do {
          num[i][j] = (int) (Math.random() * 1001);
          repetido = false;
          for (int k = 0; k < 10 * i + j; k++) {
            if (num[i][j] == num[k / 10][k % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        if (num[i][j] > max) {
          max = num[i][j];
        }
      }
    }
    int min = max;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        if (num[i][j] <= min) {
          min = num[i][j];
        }
      }
    }
    System.out.println();
    System.out.println("Numeros: ");
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        if (num[i][j] == max) {
          System.out.println("Indice " + i + " Columna " + j + ": " + num[i][j] + " Máximo");
        }
        if (num[i][j] == min) {
          System.out.println("Indice " + i + " Columna " + j + ": " + num[i][j] + " Mínimo");
        }
        if (num[i][j] != max && num[i][j] != min) {
          System.out.println("Indice " + i + " Columna " + j + ": " + num[i][j]);
        }
      }
    }
  }
}
