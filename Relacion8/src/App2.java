import paquetes.Ejercicio20_28;

public class App2 {
  public static void main(String[] args) throws Exception {

    System.out.println("generaArrayInt: ");

    int [] arrayAleatorio = Ejercicio20_28.generaArrayInt(20, 50, 5);

    for (int i = 0; i < arrayAleatorio.length ; i++){
      System.out.print(arrayAleatorio[i] + " ");
    }

    System.out.println();

    
  }
}
