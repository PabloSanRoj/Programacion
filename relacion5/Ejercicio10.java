public class Ejercicio10 {
  public static void main (String[] Args) {
    
    double num = 0;
    double i = 0;
    double resul = 0;
    
    System.out.println ("Este programa te calcula la media entre los datos introducidos");
    System.out.println ("Para terminar introduzca un número negativo");
    System.out.println ("Introduzca el número por favor: ");
    
    do {
    num = Double.parseDouble(System.console().readLine());
    
    i = i + 1;
    
    resul += num;
    
    } while (num >= 0);
    
    System.out.println ("La media de todos tus números es: " + (resul - num) / (i - 1));
  }
}  
