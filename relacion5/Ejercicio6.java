public class Ejercicio6 {
  public static void main (String[] Args) {
    
      int num =320;
      
      System.out.println ("Este programa muestra los números de 20 en 20 desde 320 hasta 160");
      
      do {
        System.out.println ("Los números de 20 en 20 desde 320 hasta 160 son los siguientes: " + num);
        num = num - 20;
      }while ((num <= 320) && (num >=160));
  }
}
