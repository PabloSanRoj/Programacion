public class Ejercicio6 {
  public static void main (String[] Args){
    int a;
    float b;
    float resultado;
    
    System.out.println("Demostración de que JAVA no sabe dividir \"bien\"");
    System.out.print("introduzca dividendo: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("introduzca divisor: ");
    b = Integer.parseInt(System.console().readLine());
    resultado= a/b;
    System.out.println("El resultado de la division es: "+resultado);
  }
}
