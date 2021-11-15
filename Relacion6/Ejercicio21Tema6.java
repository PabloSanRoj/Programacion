/* Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara*/

public class Ejercicio21Tema6 {
  public static void main(String[] args) {

    String num, num2;

    System.out.println();
    for (int i = 0; i < 5; i++) {
      num = String.valueOf((int) (Math.random() * 8));
      switch (num) {
      case "0":
        num = "1 céntimo";
        break;
      case "1":
        num = "2 céntimos";
        break;
      case "2":
        num = "5 céntimos";
        break;
      case "3":
        num = "10 céntimos";
        break;
      case "4":
        num = "20 céntimos";
        break;
      case "5":
        num = "50 céntimos";
        break;
      case "6":
        num = "1 euro";
        break;
      case "7":
        num = "2 euros";
        break;
      }
      num2 = String.valueOf((int) (Math.random() * 2));
      if (num2.equals("0")) {
        num2 = "cara";
      } else {
        num2 = "cruz";
      }
      System.out.println(num + " - " + num2);
    }
  }
}
