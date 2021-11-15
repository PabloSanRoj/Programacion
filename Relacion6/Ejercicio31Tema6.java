/* Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando. */

public class Ejercicio31Tema6 {
  public static void main(String[] args) {
    
    int num, num2, din, tirada = 0, tirada2 = 0;

    System.out.print("Cuanto dinero desea apostar: ");
    din = Integer.parseInt(System.console().readLine());

    num = (int)((Math.random()*6)+1);
    num2 = (int)((Math.random()*6)+1);

    tirada = num + num2;

    System.out.println();
    System.out.println("Dado 1: " + num);
    System.out.println("Dado 2: " + num2);
    System.out.println();
    switch (tirada){
      case 7, 11:
        din += din;
        System.out.println("Has ganado y has conseguido: " + din + "€");
      break;
      case 2,3,12:
        din = 0;
        System.out.println("Has perdido y has conseguido: " + din + "€");
      break;
      case 4,5,6,8,9,10:
      do {
      num = (int)((Math.random()*6)+1);
      num2 = (int)((Math.random()*6)+1);

      tirada2 = num + num2;
      System.out.println();
      System.out.println("Dado 1: " + num);
      System.out.println("Dado 2: " + num2);
      System.out.println();

      if (tirada2 == 7){
        din = 0;
        System.out.println("Has perdido y has conseguido: " + din + "€");
      } else if (tirada2 == tirada){
        din += din;
        System.out.println("Has ganado y has conseguido: " + din + "€");
      }
      } while (tirada2 != 7 || tirada2 != tirada);
      break;
    }
  }
}
