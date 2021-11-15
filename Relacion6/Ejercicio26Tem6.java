/* Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.

Ejemplo 1:
Introduzca la anchura de la tableta: 6
Introduzca la altura de la tableta: 4
******
*****
******
****** */

public class Ejercicio26Tem6 {
  public static void main(String[] args) {
    
    int alt, anc, ale1, ale2, ale3;

    System.out.print("Introduzca la anchura de la tableta: ");
    anc = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la altura de la tableta: ");
    alt = Integer.parseInt(System.console().readLine());

    ale1 = (int)((Math.random()*alt)+1);
    ale2 = (int)((Math.random()*2)+1);
    ale3 = (int)((Math.random()*anc)+1);

    for (int i = alt ; i > 0 ; i--) {
      if ((i == ale1) && (ale1 == 1 || ale1 == alt)) {
        for (int z = 0 ; z < anc ; z++) {
          if (ale3 == z){
            System.out.print(" ");
          } else {
          System.out.print("*");
          }
        }
      } else if (i == ale1) {
        if (ale2 == 2) {
        for (int k = 1 ; k <= anc ; k++) {
          if (k == 1){
            System.out.print(" ");
          } else {
          System.out.print("*");
          }
        }
        } else {
          for (int k = 0 ; k < anc -1 ; k++) {
            System.out.print("*");
          }
        }
      } else {
      for (int j = 0 ; j < anc ; j++) {
        System.out.print("*");
      }
    }
      System.out.println();
    }
  }
}
