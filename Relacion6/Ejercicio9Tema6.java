/*Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/

public class Ejercicio9Tema6 {
  public static void main(String[] args) {

    int num, numDigi = 0;
    System.out.println();
    System.out.println("Números aleatorios entre 0 y 100 hasta que salga el 24");
    do {
      num = (int) (Math.random()*100);
      if (num % 2 == 0) {
        numDigi++;
      }
      System.out.println(num);
    } while (num != 24);
    System.out.println("Has genenerado " + numDigi + " números pares");  
  }
}
