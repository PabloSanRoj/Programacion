public class Ejercicio7 {
  public static void main (String[] Args){
    float base;
    float total;
    
    System.out.println ("Cual es la base imponible: ");
    base = Float.parseFloat(System.console().readLine());
    
    total = base * 0.21f;
    total = total + base;
    
    System.out.printf ("El total de tu factura según tu base imponible es: %.2f" , total);
  }
}
