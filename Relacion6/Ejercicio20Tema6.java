/* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.*/

public class Ejercicio20Tema6 {
  public static void main(String[] args) {
    
    int capa, num;

    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    capa = Integer.parseInt(System.console().readLine());

    num = (int)(Math.random()*(capa+1));

    for (int i = capa ; i >= 0 ; i--) {
      for (int j = 0 ; j < 6 ; j++) {
        if (i == 0) {
          System.out.print("*");
        } else {
        if (j == 0 || j == 5) {
          System.out.print("*");
        } else {
          if (i <= num && i > 0){
            System.out.print("=");
          } else {
          System.out.print(" ");
          }
        }
      }
      }
      System.out.println();
    }
    System.out.println("La cuba tiene capacidad de " + capa + " litros y contiene " + num + " litros de agua.");
  }
}
