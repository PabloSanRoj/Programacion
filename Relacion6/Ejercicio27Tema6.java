/* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.

Ejemplo 1:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: papel
Empate */

public class Ejercicio27Tema6 {
  public static void main(String[] args) {
    
    String num, tur, gana = "Gana el ordenador";

    System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
    tur = System.console().readLine();

    num = String.valueOf((int)(Math.random()*3));
    switch (num) {
      case "0":
        num = "piedra";
      break;
      case "1":
        num = "papel";
      break;
      case "2":
        num = "tijera";
      break;
    }
    System.out.println("Turno del ordenador: " + num);

    if (num.equals(tur)){
      System.out.println("Empate");
    } else if (!num.equals(tur)){
      if ((num.equals("papel")) && (tur.equals("tijera"))){
        gana = "Gana el jugador";
      } else if ((num.equals("piedra")) && (tur.equals("papel"))){
        gana = "Gana el jugador";
      } else if ((num.equals("tijera")) && (tur.equals("piedra"))){
        gana = "Gana el jugador";
      }
      System.out.println(gana);
    }
  }
}
