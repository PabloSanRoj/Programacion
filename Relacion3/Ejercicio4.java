
public class Ejercicio4 {
  public static void main (String[] Args){
    
    int primerNumero;
    int segundoNumero;
    int multi;
    int suma;
    int resta;
    int division;
    
    System.out.println ("Dime tu primer numero: ");
    primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println ("Dime tu segundo numero: ");
    segundoNumero = Integer.parseInt(System.console().readLine());
    
    multi = primerNumero * segundoNumero;
    suma = primerNumero + segundoNumero;
    resta = primerNumero - segundoNumero;
    division = primerNumero / segundoNumero;
    
    System.out.println ("El resultado de tu suma es: " + suma);
    System.out.println ("El resultado de tu resta es: " + resta);
    System.out.println ("El resultado de tu multiplicacion es: " + multi);
    System.out.println ("El resultado de tu division es: " + division);
  }
}
