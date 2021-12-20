/* Pablo Sánchez Rojas */

public class Ex24psr2 {
  public static void main(String[] args) {

    long numero, aux;

    int conta = 0;

    System.out.print("Introduzca un número entero: ");
    numero = Long.parseLong(System.console().readLine());

    int[] MatrizUni = new int[10];
    int[] MatrizUni2 = new int[10];

    aux = numero;

    for (long i = aux; i > 0; i /= 10) {
      conta++;
    }

    for (int i = 0; i < 10; i++) {
      MatrizUni[i] = i;
    }

    for (long i = conta; i > 0; i--) {
      long aux2 = aux % 10;
      aux /= 10;

      for (int j = 0; j < 10; j++) {
        if (MatrizUni[j] == aux2) {
          MatrizUni2[j] = MatrizUni2[j] + 1;
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      if (MatrizUni2[i] == 0) {
        System.out.print("");
      } else {
        System.out.println("El dígito '" + i + "' aparece " + MatrizUni2[i] + " veces.");
      }
    }
  }
}
