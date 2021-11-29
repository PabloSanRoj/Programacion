/* Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.*/

public class Ejercicio8Tema7_2 {
  public static void main(String[] args) {

    int alfil, fila, columna;

    int [][] comprobador = new int [8][8];

    System.out.print("Introduzca la coordenada del alfil: ");
    alfil = Integer.parseInt(System.console().readLine());

    fila = alfil % 10;
    fila /= 10;
    columna = alfil % 10;

    for (int i = 0; i < 8 ; i++){
      for (int j = 0 ; j < 8 ; j++){
        if ((i /= fila && j /= columna))
      }
    }
  }
}
