/* Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura. */

public class Ejercicio1Tema7_2 {
  public static void main(String[] args) {
    
    int [][] num = new int [3][6];

    num[0][0]= 0;
    num[0][1]= 30;
    num[0][2]= 2;
    num[0][5]= 5;
    num[1][0]= 75;
    num[1][4]= 0;
    num[2][2]= -2;
    num[2][3]= 9;
    num[2][5]= 11;

    System.out.println();
    System.out.println("Array numeros: ");
    for (int i = 0 ; i < 3; i++){
      for (int j = 0 ; j < 6 ; j++){
        System.out.println("Indice " + i + " Columna " + j + ":  "+ num[i][j]);
      }
    }

  }
}
