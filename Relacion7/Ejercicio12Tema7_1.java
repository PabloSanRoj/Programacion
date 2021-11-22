/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7: */

public class Ejercicio12Tema7_1 {
  public static void main(String[] args) {

    int ini, fin;
    
    int[] num = new int[11];
    int[] num2 = new int[11];

    System.out.println("Introduzca 10 números");
    for (int i = 0; i < 10; i++) {
      System.out.print("Indice " + i + ": ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();

    do {
    System.out.print("Introduzca número inicial: ");
    ini = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca número final: ");
    fin = Integer.parseInt(System.console().readLine());
    } while ((fin <= ini) || (fin < 0 || fin >= 10) || (ini < 0 || ini >= 10));

    for (int i = 0; i < 10; i++) {
      num2[i] = 0;
    }

    for (int i = fin; i <= 10 ; i++){
      if (i == 10){
        for (int j = 0 ; j <= ini ; j++){
          if (j == 0){
            num2[0] = num[j=9];
            j = 1;
          }
          if (j >= 1){
            num2[j] = num[j-1];
          }
        }
      } else {
      num2[i+1] = num[i];
      }
    }
    for (int i = ini+1; i < fin ; i++){
      num2[i] = num[i];
    }
    num2[fin] = num[ini];
    for (int i = 0 ; i < 10 ; i++){
      System.out.println("Indice " + i + ": " + num2[i]);
    }
  }
}
