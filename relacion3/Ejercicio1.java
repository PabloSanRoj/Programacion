
public class Ejercicio1 {
  public static void main (String[] Args){
    
    int primerNumero;
    int segundoNumero;
    int multi;
    
    System.out.println ("Dime tu primer numero: ");
    primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println ("Dime tu segundo numero: ");
    segundoNumero = Integer.parseInt(System.console().readLine());
    
    multi = primerNumero * segundoNumero;

    System.out.println ("El resultado de tu multiplicacion es: " + multi);

  }
}
