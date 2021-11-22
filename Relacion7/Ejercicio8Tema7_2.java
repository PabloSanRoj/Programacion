/* Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.*/

public class Ejercicio8Tema7_2 {
  public static void main(String[] args) {
    
    final int VACIO = 0;
    final int POSICION = 1;
    final int INTENTO = 3;

    int x;
    int y;
    int[][] cuadrante = new int[9][9];
    // inicializa el array
    for (x = 1; x < 9; x++) {
      for (y = 1; y < 9; y++) {
        cuadrante[x][y] = VACIO;
      }
    }
    // coloca el alfil
    int posicionX = Integer.parseInt(System.console().readLine());
    int posicionY = Integer.parseInt(System.console().readLine());
    cuadrante[posicionX][posicionY] = POSICION;

    for (y = 7; y >= 0; y--) {
      System.out.print(y + "|");
      for (x = 0; x < 8; x++) {
        if (cuadrante[x][y] == INTENTO) {
          System.out.print("X ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println(" ----------------\n 1 2 3 4 5 6 7 8 \n");
    
    // juego
    System.out.println("Movimientos de un alfil tu abuela");

  }
}
