public class Ejercicio10 {
  public static void main (String[] Args) {
    
    double num = 0;
    double i = 0;
    double resul = 0;
    int intro;
    int j = 1;
    
    System.out.println ("Este programa te calcula la media entre los datos introducidos");
    System.out.println ("Para terminar introduzca un número negativo");
    System.out.println("Cuantos números desea introducir: ");
    intro = Integer.parseInt(System.console().readLine());
    System.out.println ("Introduzca el número por favor: ");
    
    do {
    num = Double.parseDouble(System.console().readLine());
    
    if (num < 0) {
      System.out.println("Solo se permiten números positivos");
    } else {
    i = intro;
    
    resul += num;
    j++;
    }
    } while (j <= intro );
    
    System.out.println ("La media de todos tus números es: " + (resul) / (intro));
  }
}  
