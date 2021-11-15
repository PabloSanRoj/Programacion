/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */

public class Ejercicio1Tema6 {
  public static void main(String[] args) {

    int total = 0, dado;
    
    for (int i = 0 ; i < 3 ; i++){
      dado = ((int)(Math.random()*6) + 1);
      System.out.println("Este dado es: " + dado);
    
    total = total + dado;
  }
    System.out.println("La suma de los dados es: " + total);

    System.out.println();
  }
}
