public class Ejercicio3 {
  public static void main (String[] Args){
    
    float pesetas;
    float conversor;

    System.out.println ("Dime las pesetas que tienes: ");
    pesetas = Float.parseFloat(System.console().readLine());
    
    conversor = pesetas * 0.0060f;
    
    System.out.printf ("Tus pesetas equivalen a: %.2f " , conversor);
    System.out.println (" euros");
  }
}
