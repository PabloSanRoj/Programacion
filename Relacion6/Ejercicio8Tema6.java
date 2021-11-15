/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).*/
/* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/

public class Ejercicio8Tema6 {
  public static void main(String[] args) {
    
    String num;

    for (int i = 1; i <= 15 ; i++) {
      System.out.print("Partido " + i + "\t");
      for (int j = 0 ; j < 3 ; j++) {
        num = String.valueOf((int) (Math.random()*6));
      switch (num){
        case "0", "3", "4":
          num = ("| 1 |");
        break;
        case "1", "5":
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

