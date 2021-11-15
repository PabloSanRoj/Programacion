/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/

public class Ejercicio11Tema6 {
  public static void main(String[] args) {
    
    int numDigi1 = 0, numDigi2 = 0, numDigi3 = 0, numDigi4 = 0, numDigi5 = 0;
    String num;
    System.out.println();
    System.out.println("Notas: ");
    for (int i = 1; i <= 20 ; i++) {
      num = String.valueOf((int)(Math.random()*5));
      switch (num){
        case "0":
          num = "Suspenso";
          numDigi1++;
        break;
        case "1":
          num = "Suficiente";
          numDigi2++;
        break;
        case "2":
          num = "Bien";
          numDigi3++;
        break;
        case "3":
          num = "Notable";
          numDigi4++;
        break;
        case "4":
          num = "Sobresaliente";
          numDigi5++;
        break;
      }
      System.out.println("nota " + i + ": " + num);
    }
    System.out.println();
    System.out.println("El número de Suspensos es: " + numDigi1);
    System.out.println("El número de Suficientes es: " + numDigi2);
    System.out.println("El número de Bien es: " + numDigi3);
    System.out.println("El número de Notables es: " + numDigi4);
    System.out.println("El número de Sobresalientes es: " + numDigi5);
    System.out.println();
  }
}
