public class Ejercicio17 {
  public static void main (String[] Args) {
    
    int num;
    
    System.out.println ("Este programa te dice la ultima cifra del numero introducido");
    System.out.println ("Por favor introduzca un numero");
    num = Integer.parseInt(System.console().readLine());
    
    System.out.println ("La última cifra de tu número es: " + (num%10));
    
  }
}
