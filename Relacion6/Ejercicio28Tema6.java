/* Realiza un programa que sea capaz de recolocar los números de un array de
fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
del array. A continuación generará un array con ese tamaño con números
enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
irá colocando desde fuera hacia adentro los números de tal forma que el
primero se coloca en la primera posición, el segundo en la última, el tercero
en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
el array resultado.

Ejemplo 1:
Introduzca el tamaño del array: 12
Array original:
Índice 0 1 2 3 4 5 6 7 8 9 10 11
Valor 120 148 40 108 188 94 60 65 152 27 121 79
Array resultado:
Índice 0 1 2 3 4 5 6 7 8 9 10 11
Valor 120 40 188 60 152 121 79 27 65 94 108 148*/

public class Ejercicio28Tema6 {
  public static void main(String[] args) {
    
    int tamaño;

    System.out.print("Introduzca el tamaño del array: ");
    tamaño = Integer.parseInt(System.console().readLine());
    
    int [] num = new int [tamaño];
    int [] num2 = new int [tamaño];

    System.out.println();
    System.out.println("Array original: ");
    for (int i = 0 ; i < 12 ; i++){
      num[i] = (int)(Math.random()*201);
      System.out.println("Indice " + i + ":" + num[i]);
    }

    int j = 0;
    for (int i = 0 ; i < tamaño ; i++){
      if (i % 2 == 0){
        num2[j] = num[i];
        j++;
      }
    }
    for (int i = tamaño ; i >= 0 ; i--){
      if (i % 2 != 0){
        if (tamaño % 2 == 0){
        num2[j=tamaño-1] = num[i];
        j--;
        } else {
          num2[j=tamaño] = num[i];
          j--;  
        }
      }
    }
    System.out.println();
    System.out.println("Array resultado: ");
    for (int i = 0 ; i < tamaño ; i++){
        System.out.println("Indice " + i + ":" + num2[i]);
    }
  }
}
