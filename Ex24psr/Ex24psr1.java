/* Pablo Sánchez Rojas */

public class Ex24psr1 {
  public static void main(String[] args) {
    
    int filas, columnas, calculo, extInf, extSup, conta = 0;
    boolean repetido;

    do{
    System.out.print("Introduzca el nº de filas [1-20]: ");
    filas = Integer.parseInt(System.console().readLine());
    } while (filas < 1 || filas > 20);
    do{
    System.out.print("Introduzca el nº de columnas [1-20]: ");
    columnas = Integer.parseInt(System.console().readLine());
    } while (columnas < 1 || columnas > 20);

    calculo = filas * columnas;

    do{
      System.out.print("Introduzca el extremo inferior del intervalo aleatorio: ");
      extInf = Integer.parseInt(System.console().readLine());

      System.out.print("Introduzca el extremo superior del intervalo aleatorio: ");
      extSup = Integer.parseInt(System.console().readLine());

      if (extSup - extInf < calculo - 1){
        System.out.println("Cantidad de datos insuficiente.");
      }
    } while (extSup - extInf < calculo - 1);

    int [][] MatrizBidi = new int [filas][columnas];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        do {
          MatrizBidi[i][j] = (int) ((Math.random() * extSup)+ extInf);
          repetido = false;
          for (int k = 0; k < columnas * i + j; k++) {
            if (MatrizBidi[i][j] == MatrizBidi[k / columnas][k % columnas]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }

    int aux = extSup;

    for (int c = aux; c > 0 ; c /= 10){
      conta++;
    }

    for (int i = 0; i < filas ; i++){
      for (int k = 0 ; k < (columnas * conta) + (2 * (columnas-1) - 1) ; k++){
        System.out.printf("─");
      }
      System.out.println();
      for (int j = 0 ; j < columnas ; j++){
        if (j == columnas - 1){
          System.out.printf("│%" + conta + "s│" , MatrizBidi[i][j]);
        } else {
        System.out.printf("│%" + conta + "s" , MatrizBidi[i][j]);
        }
      }
      System.out.println();
      if (i == filas - 1 ){
        for (int k = 0 ; k < (columnas * conta) + (2 * (columnas-1) - 1); k++){
          System.out.printf("─");
        }
      }
    }
  }
}
