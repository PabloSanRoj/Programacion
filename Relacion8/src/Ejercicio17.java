import paquetes.Ejercicio1_14;

public class Ejercicio17 {
  public static void main(String[] args) throws Exception {

    long suma = 0;

    System.out.print("Introduzca un número binario: ");
    long binario = Long.parseLong(System.console().readLine());

    int numDigi = Ejercicio1_14.digitos(binario);

    for (int i = numDigi ; i > 0 ; i--){
      long num = binario % Ejercicio1_14.potencia(10, Ejercicio1_14.digitos(binario) - 1);
      if (num == 1){
       suma = Ejercicio1_14.potencia(2, numDigi - 1);
      }
      numDigi--;
      binario = Ejercicio1_14.quitaPorDetras(binario, numDigi - 1);
    }

    System.out.println();
    System.out.println("El número binario pasado a decimal es: " + suma);
  }
}
