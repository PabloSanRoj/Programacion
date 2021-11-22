/* Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá. */

public class Ejercicio19Tema7_1 {
  public static void main(String[] args) {

    int inser, posi;
    
    int [] num = new int [12];
    int [] num2 = new int [12];

    System.out.println();
    System.out.println("Array Original: ");
    for (int i = 0 ; i < 12 ; i++){
      num[i] = (int)(Math.random()*201);
      System.out.println("Indice " + i + ": " + num[i]);
    }

    System.out.println();
    System.out.print("Introduzca el número que quiere insertar: ");
    inser = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición donde lo que quiere insertar: ");
    posi = Integer.parseInt(System.console().readLine());
    
    for (int i = 0 ; i < posi ; i++){
      num2[i] = num[i];
    }
    for (int i = posi ; i < 11 ; i++){
      if (i == posi){
        num2[i] = inser;
        num2[i+1] = num[i];
      } else {
        num2[i+1] = num[i];
      }
    }
    System.out.println();
    System.out.println("Array resultado: ");
    for (int i = 0 ; i < 12 ; i++){
      System.out.println("Indice " + i + ": " + num2[i]);
    }
  }
}
