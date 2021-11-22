public class Ejercicio2 {
  public static void main (String[] Args){
    
    float euro;
    float conversor;

    System.out.println ("Dime los euros que tienes: ");
    euro = Float.parseFloat(System.console().readLine());
    
    conversor = euro * 166.386f;
    
    System.out.printf ("Tus euros equivalen a: %.2f " , conversor);
    System.out.println (" pesetas");
  }
}
