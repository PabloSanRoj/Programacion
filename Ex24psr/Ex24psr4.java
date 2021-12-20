/* Pablo Sánchez Rojas */

public class Ex24psr4 {
  public static void main(String[] args) {

    int ancho, alto;

    System.out.print("Indique el ancho en triángulos: ");
    ancho = Integer.parseInt(System.console().readLine());

    System.out.print("Indique el alto en triángulos: ");
    alto = Integer.parseInt(System.console().readLine());

    String [] Pira = new String [4];

    /*Pira [0] = "   *";
    Pira [1] = "  **";
    Pira [2] = " ***";
    Pira [3] = "****";*/

    for (int a = 0 ; a < 4 ; a++){
      Pira[a] = "";
      for (int c = 4 ; c > 0 ; c--){
        if (c - 1 > a){
          Pira[a] = Pira[a] + " ";
        } else {
          Pira[a] = Pira[a] + "*";
        }
      }
    }

    System.out.println();

    for (int i = 0; i < alto; i++) {
      
      for (int k = 0 ; k < 4 ; k++){
        for (int j = 0; j < ancho; j++) {
          System.out.print(Pira[k] + " ");
        }
        System.out.println();
      }
      if (i != alto - 1) {
      System.out.println();
      }
    }
  }
}
