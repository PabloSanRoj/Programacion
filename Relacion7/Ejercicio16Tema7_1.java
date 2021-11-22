/* Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
Ejemplo:
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13 */

public class Ejercicio16Tema7_1 {
  public static void main(String[] args) {

    int multi;
    
    int [] num = new int [20];

    System.out.println();
    System.out.println("Numeros: ");
    for (int i = 0 ; i < 20 ; i++){
      num[i] = (int)(Math.random()*401);
      System.out.print(num[i] + " ");
    }
    System.out.println();
    System.out.print("¿Qué números quiere resaltar? (1- los multiplos de 5, 2- los múltiplos de 7): ");
    multi = Integer.parseInt(System.console().readLine());

    System.out.println();
    System.out.println("Ahora los números son: ");
    switch (multi){
      case 1:
        for (int i = 0 ; i < 20 ; i++){
          if (num[i] % 5 == 0){
            System.out.print("[" + num[i] + "] ");
          } else {
            System.out.print(num[i] + " ");
          }
        }
      break;
      case 2:
        for (int i = 0 ; i < 20 ; i++){
          if (num[i] % 7 == 0){
            System.out.print("[" + num[i] + "] ");
          } else {
            System.out.print(num[i] + " ");
          }
        }
      break;
      default:
    }
  }
}
