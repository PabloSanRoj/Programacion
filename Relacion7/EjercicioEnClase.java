

public class EjercicioEnClase {
  public static void main(String[] args) {

    boolean salir = false;
    String respuesta;
    
    int [][] matriz = new int [9][9];
    int [][] copiaMatriz = new int [9][9];

    System.out.println();
    System.out.println("Matriz Original");
    
    for (int i = 0; i < 9 ; i++){
      for (int j = 0 ; j < 9 ; j++){
        matriz[i][j] = (int)(Math.random()* 1001);
        System.out.printf( "%3d" , matriz[i][j]);
        System.out.print(" ");
      }
      System.out.println();
    }
    do {
      for (int i = 0 ; i < 9 ; i++){
        for (int j = 0 ; j < 9 ; j++){
          copiaMatriz[i][j] = matriz[i][j];
        }
      }
      System.out.println();
      salir = false;
      System.out.print("¿Quieres suavizar la matriz?: ");
      respuesta = System.console().readLine();
      if (respuesta.equalsIgnoreCase("no")){
        salir = true;
      } else {
        for (int i = 0 ; i < 9 ; i++){
          for (int j = 0; j < 9 ; j++){
            if (i == 0 && j == 0){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i+1][j] + copiaMatriz[i][j+1] + copiaMatriz[i+1][j+1]) / 4;
            }
            if (i == 0 && j == 8){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i+1][j] + copiaMatriz[i][j-1] + copiaMatriz[i+1][j-1]) / 4;
            }
            if (i == 0 && (j != 8 && j != 0)){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i+1][j] + copiaMatriz[i][j-1] + copiaMatriz[i+1][j-1] + copiaMatriz[i][j+1] + copiaMatriz[i+1][j+1]) / 6;
            }
            if (j == 0 && (i != 8 && i != 0)){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i+1][j] + copiaMatriz[i-1][j] + copiaMatriz[i+1][j+1] + copiaMatriz[i][j+1] + copiaMatriz[i-1][j+1]) / 6;
            }
            if (j == 8 && (i != 8 && i != 0)){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i+1][j] + copiaMatriz[i-1][j] + copiaMatriz[i+1][j-1] + copiaMatriz[i][j-1] + copiaMatriz[i-1][j-1]) / 6;
            }
            if (i == 8 && j == 0){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i-1][j] + copiaMatriz[i][j+1] + copiaMatriz[i-1][j+1]) / 4;
            }
            if (i == 8 && j == 8){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i-1][j] + copiaMatriz[i][j-1] + copiaMatriz[i-1][j-1]) / 4;
            }
            if (i == 8 && (j != 8 && j != 0)){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i-1][j] + copiaMatriz[i][j-1] + copiaMatriz[i-1][j-1] + copiaMatriz[i][j+1] + copiaMatriz[i-1][j+1]) / 6;
            }
            if (i != 0 && i != 8 && j != 0 && j != 8){
              matriz[i][j] = (copiaMatriz[i][j] + copiaMatriz[i][j+1] + copiaMatriz[i][j-1] + copiaMatriz[i-1][j] + copiaMatriz[i-1][j+1] + copiaMatriz[i-1][j-1] + matriz[i+1][j] + matriz[i+1][j-1] + matriz[i+1][j+1]) / 9;
            }
          }
        }
        System.out.println("Matriz suavizada");
        for (int i = 0 ; i < 9 ; i++){
          for (int j = 0 ; j < 9 ; j++){
            System.out.printf( "%3d" , matriz[i][j]);
            System.out.print(" ");
          }
          System.out.println();
        }
      }
    } while (!salir);
  }
}
