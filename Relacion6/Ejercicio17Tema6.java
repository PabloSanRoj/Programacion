/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*           *
*       &   *
* * * * * * * */

public class Ejercicio17Tema6 {
  public static void main(String[] args) {
    
    int alt, anc , num2, num;

    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    alt = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    anc = Integer.parseInt(System.console().readLine());

    num2 = (int)((Math.random()*(alt - 3))+2);
    num = (int)((Math.random()*(anc-2))+2);

    for (int i = 0 ; i < alt ; i++) {
      for (int j = 1 ; j <= anc ; j++) {
        if (i == num2 && j == num){
          System.out.print("&");
          j++;
      }
        if (i >= 1 && i <= alt-2){
          if (j == 1 || j == anc) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
