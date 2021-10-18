public class Ejercicio7 {
  public static void main (String[] Args) {
    
    int codi;
    int con = 1;
    
    System.out.println ("Este programa realiza un control de acceso a un caja fuerte");
    
    do {
      System.out.println ("Por Favor introduzca el código de la caja fuerte que es de 4 cifras");
      codi = Integer.parseInt(System.console().readLine());
    
    if (codi == 8888) {
      System.out.println ("La caja fuerte se ha abierto satisfactoriamente");
      con = con + 5;
    } else {
      System.out.println ("Lo siento, esa no es la combinación");
      con = con +1;
    }
  } while (con <= 4);  
  }    
}
