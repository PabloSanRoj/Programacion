/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. */

public class Ejercicio5Tema7_1 {
  public static void main(String[] args) {

    int max = 0;
    
    int [] num = new int [10];

    for (int i = 0 ; i < 10 ; i++){
      System.out.print("Introduzca un número: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0 ; i < 10 ; i++){
      if (num[i] > max){
        max = num[i];
      }
    }
    int min = max;
    for (int i = 0 ; i < 10 ; i++){
      if (num[i] <= min) {
        min = num[i];
      }
    }
    for (int i = 0 ; i < 10 ; i++){
      if (num[i] == max){
        System.out.println(num[i] + " Máximo");
      }
      if (num[i] == min){
        System.out.println(num[i] + " Mínimo");
      }
      if (num[i] != max && num[i] != min){
        System.out.println(num[i]);
      }

    }
  }
} 
