/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. */

public class Ejercicio7Tema7_1 {
  public static void main(String[] args) {

    int num2, num3;
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    int [] num = new int [100];

    System.out.println();
    for (int i = 0 ; i < 100 ; i++){
      num[i] = (int)(Math.random()*21);
      System.out.print(num[i] + " ");
    }
    System.out.println();
    
    System.out.print("Introduzca un número de los mostrados anteriormente: ");
    num2 = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un número por el que sustituir los valores: ");
    num3 = Integer.parseInt(System.console().readLine());

    for (int i = 0 ; i < 100 ; i++){
      if (num[i] == num2){
        System.out.print(verde + "\"" + num3 + "\" ");
      } else {
        System.out.print(blanco + num[i] + " ");
      }
    }
  }
}
