/* 4. [2,5 puntos] Escriba un programa que pinte un puente con las siguientes características:
a) El puente tiene tres partes bien diferenciadas si miramos de izquierda a derecha: una subida, una pasarela
o plataforma y una bajada.
b) En la longitud total se incluyen las tres partes mencionadas.
c) Tanto la subida como la bajada siempre son iguales, sólo cambia la plataforma, que puede ser más larga o
más corta en función del número introducido por el usuario.
d) En la plataforma puede haber gente mirando el bonito paisaje. La probabilidad de que haya una persona
en una posición concreta de dicha plataforma es de 1⁄3.
Si la longitud introducida por el usuario no es mayor que 6, se debe mostrar un mensaje de error y volver a
pedir el dato, cosa que hará hasta que se introduzca un dato correcto.*/

public class Ejercicio4Control2de2020 {
  public static void main(String[] args) {

    int longitud;

    do {
    System.out.print("Introduzca la longitud total del puente (un número mayor que 6): ");
    longitud = Integer.parseInt(System.console().readLine());
    if (longitud <= 6){
    System.out.println("El dato introducido es incorrecto.");
    }
    } while (longitud <= 6);

    for (int j = 0; j < 4; j++) {
      if (j == 0) {
        for (int i = 0; i < longitud - 2; i++) {
          if (i == 0 || i == 1) {
            System.out.print(" ");
          } else {
            int pintar = (int) (Math.random() * 3);

            switch (pintar) {
            case 0:
              System.out.print("&");
              break;
            case 1, 2:
              System.out.print(" ");
            default:
            }
          }
        }
      }
      if (j == 1) {
        for (int i = 0; i < longitud - 2; i++) {
          if (i == 0 || i == 1) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        }
      }
      if (j == 2) {
        for (int i = 0; i < longitud - 1; i++) {
          if (i == 1 || i == longitud - 2) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      if (j == 3) {
        for (int i = 0; i < longitud; i++) {
          if (i == 0 || i == longitud - 1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
