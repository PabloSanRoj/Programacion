/* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.*/

public class Ejercicio18Tema6 {
  public static void main(String[] args) {

    String num, num1 = "z", num2 = "y", num3 = "x";
    int x = 0;

    System.out.println();
    for (int j = 1 ; j <= 3 ; j++){
      System.out.print("Los colores para el dormitorio " + j + " son: ");
    for (int i = 0 ; i < 3; i++) {
      do {
      num = String.valueOf((int)(Math.random()*6));
      if (i == 0) {
        num1 = num;
      } else if (i == 1) {
        num2 = num;
      } else if (i == 2) {
        num3 = num;
      }
      if (num1.equals(num2) || num1.equals(num3) || num2.equals(num3)) {
        x = 1;
      } else {
        x = 0;
      }
        switch (num) {
          case "0":
            num = "rojo";
          break;
          case "1":
            num = "azul";
          break;
          case "2":
            num = "verde";
          break;
          case "3":
            num = "amarillo";
          break;
          case "4":
            num = "violeta";
          break;
          case "5":
            num = "naranja";
          break;
          default:
        }
      }while (x == 1);
        System.out.print(num + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  }

