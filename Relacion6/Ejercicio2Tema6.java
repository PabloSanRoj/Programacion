/*Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).*/

public class Ejercicio2Tema6 {
  public static void main(String[] args) {
    
    int carta;
    String num, palo = "";

    carta = (int)(Math.random()*4);

    switch (carta) {
      case 0:
        palo = "picas";
      break;
      case 1:
        palo = "corazones";
      break;
      case 2:
        palo = "diamantes";
      break;
      case 3:
        palo = "tréboles";
      break;
      default:
    }

    num = String.valueOf((int)(Math.random()*12) + 1);

    switch (num) {
      case "1":
        num = "A";
      break;
      case "10":
        num = "J";
      break;
      case "11":
        num = "Q";
      break;
      case "12":
        num = "K";
      break;
      default:
    }

    System.out.println("La carta es: " + num + " de " + palo);
  }
}
