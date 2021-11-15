/*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.*/

public class Ejercicio12Tema6 {
  public static void main(String[] args) {

    int num;
    int x = 0;

    do {
      num = ((int)(Math.random()*97)+32);
      System.out.print((char) num);
      x++;
    } while (x != 20000);
  }
}
