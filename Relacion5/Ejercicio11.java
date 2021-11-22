public class Ejercicio11 {
  public static void main (String[] Args) {
    
    int num;
  
    System.out.println ("Este programa muestra en 3 columnas el cuadrado y el cubo de los 5 primeros numeros enteros introducidos");
    System.out.println ("Por favor introduzca el número");
    num = Integer.parseInt(System.console().readLine());
    
    for (int i = num ; i < num + 5 ; i++) {
      System.out.printf ("%4d %6d %8d\n" , i , i*i , i*i*i);
    }
  }
} 
