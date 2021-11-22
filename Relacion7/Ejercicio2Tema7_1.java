public class Ejercicio2Tema7_1 {
  public static void main(String[] args) {
    
    char [] num = new char [10];
    
    num [0] = 'a';
    num [1] = 'x';
    num [4] = '@';
    num [6] = ' ';
    num [8] = '+';
    num [9] = 'Q';

    for (int i = 0 ; i < 10 ; i++) {
      System.out.println("Índice " + i + " tiene el valor de: " + num[i]);
    }
  }
}
