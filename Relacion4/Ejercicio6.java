public class Ejercicio6 {
  public static void main (String[] Args){
        
    double altura;
    double tiempo;
    
    System.out.println ("Introduzca desde que altura cayó el objeto: ");
    altura = Float.parseFloat(System.console().readLine());
    
    tiempo = Math.sqrt ((2 * altura)/9.81 );
    
    System.out.printf ("El objeto tardó: " + tiempo + " segundos en caer");
  } 
}
