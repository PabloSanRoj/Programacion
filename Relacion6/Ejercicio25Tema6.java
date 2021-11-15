/* Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).*/

public class Ejercicio25Tema6 {
  public static void main(String[] args) {
    
    int num;
    String cinco;
    boolean primo = false;

    System.out.println();
    System.out.println("Números entre 10 y 200: ");

    for (int i = 0 ; i < 100 ; i++) {
      num = (int)((Math.random()*199)+10);
      if (num % 5 == 0) {
        cinco = "[" + num + "]";
        System.out.print(cinco + " ");
      } else {
        do {
        int j = 2;
          if (num % j == 0) {
            System.out.print(num + " ");
            primo = true;
          }
        if (num == j){
          System.out.print("#" + num + "#" + " ");
          primo = true;
        }
        j++;
      } while (primo = false);
      }
    }
    }
}

