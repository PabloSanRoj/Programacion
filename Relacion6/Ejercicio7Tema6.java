/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).*/

public class Ejercicio7Tema6 {
  public static void main(String[] args) {
    
    String num;

    for (int i = 1; i <= 15 ; i++) {
      System.out.print("Partido " + i + "\t");
      for (int j = 0 ; j < 3 ; j++) {
        num = String.valueOf((int) (Math.random()*3));
      switch (num){
        case "0":
          num = ("| 1 |");
        break;
        case "1":
          num = ("| x |");
        break;
        case "2":
          num = ("| 2 |");
        break;
        default:
      }
      System.out.print(num);
      }
      System.out.println();
    }


  }
}
