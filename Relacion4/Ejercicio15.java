import java.util.Scanner;
public class Ejercicio15 {
  public static void main (String[] Args){
    
    Scanner sc = new Scanner (System.in);
    
    String piramide;
    char simbolo;
    
    System.out.println ("Bienvenido al menú de realización de una pirámide");
    System.out.println ("Por favor introduzca el lado hacia el que quieres que se haga la pirámide");
    System.out.println ("Las opciones son las siguientes: "); 
    System.out.println ("arriba");
    System.out.println ("abajo");
    System.out.println ("izquierda");
    System.out.println ("derecha");
    System.out.println ("");
    piramide = System.console().readLine();
    
    System.out.println ("");
    
    System.out.println ("Ahora introduzca el símbolo con el que quiere hacer la pirámide: ");
    System.out.println ("(Ojo la piramde va a ser de un solo caracter)");
    simbolo = sc.next().charAt(0);
    System.out.println ("");
    
    if (piramide.equals("abajo")) {
        System.out.println ("Tu pirámide es la siguiente: ");
        System.out.println ("");
        System.out.println ("");
        System.out.println (" " + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println ("  " + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println ("   " + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println ("    " + simbolo + simbolo + simbolo);
        System.out.println ("     " + simbolo);
    } else if (piramide.equals("arriba")) {
        System.out.println ("Tu pirámide es la siguiente: ");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("     " + simbolo);
        System.out.println ("    " + simbolo + simbolo + simbolo);
        System.out.println ("   " + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println ("  " + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println (" " + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo);
    } else if (piramide.equals("derecha")) {
        System.out.println ("Tu pirámide es la siguiente: ");
        System.out.println ("");
        System.out.println ("");
        System.out.println (" " + simbolo);
        System.out.println (" " + simbolo + simbolo);
        System.out.println (" " + simbolo + simbolo + simbolo);
        System.out.println (" " + simbolo + simbolo + simbolo + simbolo);
        System.out.println (" " + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println (" " + simbolo + simbolo + simbolo + simbolo);
        System.out.println (" " + simbolo + simbolo + simbolo);
        System.out.println (" " + simbolo + simbolo);
        System.out.println (" " + simbolo);
    } else if (piramide.equals("izquierda")) {
        System.out.println ("Tu pirámide es la siguiente: ");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("     " + simbolo);
        System.out.println ("    " + simbolo + simbolo);
        System.out.println ("   " + simbolo + simbolo + simbolo);
        System.out.println ("  " + simbolo + simbolo + simbolo + simbolo);
        System.out.println (" " + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println ("  " + simbolo + simbolo + simbolo + simbolo);
        System.out.println ("   " + simbolo + simbolo + simbolo);
        System.out.println ("    " + simbolo + simbolo); 
        System.out.println ("     " + simbolo); 
    } else {
      System.out.println ("Has introducido algún caracter mal");
    }
  }
}
