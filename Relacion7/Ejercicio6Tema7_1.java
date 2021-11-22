/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array. */

public class Ejercicio6Tema7_1 {
  public static void main(String[] args) {
    
    int [] num = new int [15];

    for (int i = 0 ; i < 15 ; i++){
      if (i == 14){
        System.out.print("Introduzca un número: ");
        num[0] = Integer.parseInt(System.console().readLine());
      } else {
      System.out.print("Introduzca un número: ");
      num[i+1] = Integer.parseInt(System.console().readLine());
      }
    }

    System.out.println("Tus valores una posición adelantada son los siguientes: ");
    for (int i = 0 ; i < 15 ; i++){
      System.out.println(num[i]);
    }
  }
}
