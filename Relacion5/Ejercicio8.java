public class Ejercicio8 {
  public static void main (String[] Args) {
    
    int num;
    
    System.out.println ("Este programa te enseña la tabla de multiplicar del numero introducido");
    System.out.println ("Introduzca un numero");
    num = Integer.parseInt(System.console().readLine());
    
    for (int i = 0 ; i <= 10; i++) {
      System.out.printf ("%d * %d = %d\n" , num , i , i * num);
    }
  }    
}
