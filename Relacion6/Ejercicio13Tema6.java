/* Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.*/

public class Ejercicio13Tema6 {
  public static void main(String[] args) {
    
    int num, num2;

    System.out.println();
    do {
      num = (int)((Math.random()*6) + 1);
      num2 = (int)((Math.random()*6) + 1);
      System.out.println("Dado 1: " + num);
      System.out.println("Dado 2: " + num2);
      System.out.println();
    } while (num != num2);
  }
}
