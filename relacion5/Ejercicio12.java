public class Ejercicio12 {
  public static void main (String[] Args) {
    
    int num;
    int resul = 1;
    int priNum = 0;
    int seguNum = 1;
  
    System.out.println ("Este programa muestra tantos numeros de la serie Fibonacci como desees");
    System.out.println ("Por favor introduzca el número de la serie");
    num = Integer.parseInt(System.console().readLine());
    System.out.println ("");  
    System.out.println ("La serie es la siguiente: ");  
    
    System.out.println(priNum);

      for (int i = 1 ; i < num ; i++) {
        System.out.println(resul);
        resul = priNum + seguNum;
        priNum = seguNum;
        seguNum = resul;
    }
  }
} 
