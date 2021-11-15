/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario de-
be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,

el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.*/

public class Ejercicio6Tema6 {
  public static void main(String[] args) {
    
    int num, numIntro, i = 5;

    num = (int)(Math.random()*101);

    for ( i = 5 ; i > 0; i--) {
      System.out.println("Introduzca un número para ver si lo has adivinado");
      System.out.println("Tienes " + i + " intentos");
      numIntro = Integer.parseInt(System.console().readLine());
      if (numIntro == num) {
        i = -1;
        System.out.println("Felicidades has acertado el número");
      } else if (numIntro > num){
        System.out.println("Tu número es mayor que el número secreto");
      } else if (numIntro < num){
        System.out.println("Tu número es menor que el número secreto");
      }
      System.out.println();
    }
      if (i == 0) {
        System.out.println("Lo siento mucho el número era: " + num);
      }
  }
}
