/* Escribe un programa que rellene un array de 100 elementos con números en-
teros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación

el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
Ejemplo:
459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
251 6 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225
426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466
262 422 275 384 399 397 87 218 84 312 480 207 68 108

¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1

459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402
225 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368
466 262 422 275 384 399 397 87 218 84 312 480 207 68 108*/

public class Ejercicio13Tema7_1 {
  public static void main(String[] args) {

    int max = 0, des;
    
    int [] num = new int [100];

    for (int i = 0 ; i < 100 ; i++){
      num[i] = (int)(Math.random()*501);
    }
    for (int i = 0 ; i < 100 ; i++){
      if (num[i] > max){
        max = num[i];
      }
    }
    int min = max;
    for (int i = 0 ; i < 100 ; i++){
      if (num[i] <= min) {
        min = num[i];
      }
    }
    System.out.println("Los números son los siguientes: ");
    for (int i = 0 ; i < 100 ; i++){
      System.out.print(num[i] + " ");
    }

    System.out.println();
    System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
    des = Integer.parseInt(System.console().readLine());
    System.out.println();

    switch (des){
      case 1:
        for (int i = 0 ; i < 100 ; i++){
        if (num[i] == min){
          System.out.print("**" + num[i] + "** ");
        } else {
          System.out.print(num[i] + " ");
        }
        }
      break;
      case 2:
      for (int i = 0 ; i < 100 ; i++){
        if (num[i] == max){
          System.out.print("**" + num[i] + "** ");
        } else {
          System.out.print(num[i] + " ");
        }
        }
      break;
      default:
    }
  }
}
