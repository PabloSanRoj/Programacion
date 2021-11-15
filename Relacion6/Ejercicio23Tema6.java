/* Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
Ejemplo 1:
Q J 7 J As
Ejemplo 2:
K 8 J As 7*/

public class Ejercicio23Tema6 {
  public static void main(String[] args) {

    String num;

    System.out.println();
    System.out.println("Las 5 tiradas del dado son : ");

    for (int i = 0; i < 5; i++) {
      num = String.valueOf((int) (Math.random() * 6));
      switch (num) {
      case "0":
        num = "As";
        break;
      case "1":
        num = "K";
        break;
      case "2":
        num = "Q";
        break;
      case "3":
        num = "J";
        break;
      case "4":
        num = "7";
        break;
      case "5":
        num = "8";
        break;
      default:
      }
      System.out.print(num + " ");
    }
  }
}
