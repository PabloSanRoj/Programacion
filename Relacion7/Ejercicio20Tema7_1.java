/* Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1o y el segundo como Felipe 2o. */

public class Ejercicio20Tema7_1 {
  public static void main(String[] args) {
    
    int reyes;

    System.out.print("Introduzca el numero de reyes: ");
    reyes = Integer.parseInt(System.console().readLine());

    String [] num = new String [reyes];
    String [] rey = new String [reyes];

    for (int i = 0 ; i < reyes ; i++){
    System.out.println("Introduzca reyes y pulse INTRO: ");
    num[i] = System.console().readLine();
    rey[i] = num[i];
    }
    for (int i = 0 ; i < reyes ; i++){
      for (int j = 0 ; j < reyes ; j++){
      if (!rey[j].equals(num[i])){
        System.out.println(rey + "1º" );
      }
      }
    }
  }
}
