/* Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor... Cuando se acaben los menores o los mayores, se completará con los
números que queden. */

public class Ejercicio18Tema7_1 {
  public static void main(String[] args) {

    boolean salir = false;
    
    int [] num = new int [10];
    int [] num2 = new int [10];

    System.out.println();
    System.out.println("Array original: ");
    for (int i = 0 ; i < 10 ; i++){
      num[i] = (int)(Math.random()*201);
      System.out.println("Indice " + i + ": " + num[i]);
    }
    int k = 0;
    for (int i = 0 ; i < 10 ; i++){
          do{
          for (int j = 0 ; j < 10 ; j++){
            if (num[j] <= 100){
              num2[k] = num[j];
              k++;
              salir = true;
              j++;
            }
          }
        } while (salir == false);
          salir = false;
          do{
            for (int j = 0 ; j < 10 ; j++){
              if (num[j] > 100){
                num2[k] = num[j];
                k++;
                salir = true;
                j++;
              }
            }
          } while (salir == false);
      }

      System.out.println();
      System.out.println("Array resultado: ");
      for (int i = 0 ; i < 10 ; i++){
        System.out.println("Indice " + i + ": " + num2[i]);
      }
    }
  }

