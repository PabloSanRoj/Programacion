public class Ejercicio5 {
  public static void main (String[] Args) {
    
      int num =320;
      
      System.out.println ("Este programa muestra los números de 20 en 20 desde 320 hasta 160");
      
      while ((num <= 320) && (num >=160)) {
        System.out.println ("Los números de 20 en 20 desde 320 hasta 160 son los siguientes: " + num);
        num = num - 20;
      }
  }
}
