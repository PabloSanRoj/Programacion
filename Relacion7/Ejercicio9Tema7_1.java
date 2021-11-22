/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.*/

public class Ejercicio9Tema7_1 {
  public static void main(String[] args) {
    
    int [] num = new int [8];

    for (int i = 0 ; i < 8 ; i++){
      System.out.print("Introduzca un número: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0 ; i < 8 ; i++){
      if (num[i] % 2 == 0){
        System.out.println(num[i] + " Par");
      } else {
        System.out.println(num[i] + " Impar");
      }
    }
  }
}
