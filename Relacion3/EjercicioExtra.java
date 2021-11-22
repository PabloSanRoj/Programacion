import java.util.Scanner;

public class EjercicioExtra {
  public static void main (String[] Args){
    
    Scanner s = new Scanner (System.in);
    
    String frase;
    
    System.out.println ("Introduce frase 1");
    frase = s.nextLine();
    
    System.out.println ("Introduce frase 2");
    frase = frase+" "+s.nextLine();
    
    System.out.println ("Introduce frase 3");
    frase = frase+" "+s.nextLine();
    
    System.out.println ("Introduce frase 4");
    frase = frase+" "+s.nextLine();
    
    System.out.println ("Introduce frase 5");
    frase = frase+" "+s.nextLine();
    
    System.out.println ("Tus frases son: " + frase);
  }
}
