/* Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.*/

public class Ejercicio5Tema7_2 {
  public static void main(String[] args) {

    int max = 0;
    
    int [][]num = new int [6][10];

    System.out.println();
    System.out.println("Números: ");
    for (int i = 0 ; i < 6 ; i++){
      for (int j = 0 ; j < 10 ; j++){
        num[i][j] = (int)(Math.random()*1001);
        System.out.println("Indice " + i + " Columna " + j + ": " + num[i][j]);
      }
    }
    for (int i = 0 ; i < 6 ; i++){
      for (int j = 0 ; j <10 ; j++){
      if (num[i][j] > max){
        max = num[i][j];
      }
    }
    }
    int min = max;
    for (int i = 0 ; i < 6 ; i++){
      for (int j = 0 ; j <10 ; j++){
      if (num[i][j] <= min) {
        min = num[i][j];
      }
    }
    }
    System.out.println();
    System.out.println("Numeros: ");
    for (int i = 0 ; i < 6 ; i++){
      for (int j = 0 ; j <10 ; j++){
      if (num[i][j] == max){
        System.out.println("Indice " + i + " Columna " + j + ": " + num[i][j] + " Máximo");
      }
      if (num[i][j] == min){
        System.out.println("Indice " + i + " Columna " + j + ": " + num[i][j] + " Mínimo");
      }
      if (num[i][j] != max && num[i][j] != min){
        System.out.println("Indice " + i + " Columna " + j + ": " + num[i][j]);
      }
    }
    }
  }
}
