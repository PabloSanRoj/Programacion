/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/ 

public class Ejercicio3Tema6 {
  public static void main(String[] args) {
    int carta;
    String num, palo = "";

    carta = (int)(Math.random()*4);

    switch (carta) {
      case 0:
        palo = "espadas";
      break;
      case 1:
        palo = "oros";
      break;
      case 2:
        palo = "bastos";
      break;
      case 3:
        palo = "copas";
      break;
      default:
    }

    num = String.valueOf((int)(Math.random()*9) + 1);

    switch (num) {
      case "1":
        num = "As";
      break;
      case "8":
        num = "sota";
      break;
      case "9":
        num = "caballo";
      break;
      case "10":
        num = "rey";
      break;
      default:
    }

    System.out.println("La carta es: " + num + " de " + palo);
  }
}
