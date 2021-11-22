/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. */

public class Ejercicio11Tema7_1 {
  public static void main(String[] args) {

    boolean primo = false;

    int[] num = new int[10];
    int[] num2 = new int[10];

    System.out.println("Introduzca 10 números");
    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();

    int j = 0;
    for (int i = 0; i < 10; i++) {
      primo = false;
        for (int o = 2; o <= num[i] && primo == false; o++) {
          if (o == num[i]) {
            num2[j] = num[i];
            j++;
            primo = true;
          } else {
            if (num[i] % o == 0){
              primo = true;
            }
          }
        }
      
    }
    
    primo = false;
    for (int i = 0; i < 10; i++) {
      primo = false;
      
        for (int o = 2; o < num[i] && primo == false; o++) {
          if (num[i] % o == 0) {
            primo = true;
          }
        }
      
      if (primo == true) {
        num2[j] = num[i];
        j++;
      }
    }
    
    System.out.println("Los números ordenados primero por primos luego normales son: ");
    System.out.println();
    for (int k = 0; k < 10; k++) {
      System.out.println(k + " = " + num2[k]);
    }
    System.out.println();
  }
}
