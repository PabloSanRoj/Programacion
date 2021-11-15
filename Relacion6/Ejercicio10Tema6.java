/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.*/

public class Ejercicio10Tema6 {
  public static void main(String[] args) {
    
    int num;
    String num2;

    for (int i = 0 ; i < 10 ; i++) {
      num = ((int)(Math.random()*40)+1);

      for (int j = 0 ; j < num ; j++){
        num2 = String.valueOf((int)(Math.random()*6));
        switch (num2) {
          case "0":
            num2 = "*";
          break;
          case "1":
            num2 = "-";
          break;
          case "2":
            num2 = "=";
          break;
          case "3":
            num2 = ".";
          break;
          case "4":
            num2 = "|";
          break;
          case "5":
            num2 = "@";
          break;
        }
        System.out.print(num2);
      }
      System.out.println();
    }
  }
}
