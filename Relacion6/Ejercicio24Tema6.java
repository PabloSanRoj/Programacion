/* Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7
Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3
Ejemplo 3:
Por favor, introduzca un número entero positivo: 406783
0*/

public class Ejercicio24Tema6 {
  public static void main(String[] args) {
  
    int num, aux, aux2, aux3, numDigi = 0;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());

    aux = num;
    aux3 = num;
    do {
      aux /= 10;
      numDigi++;
    } while (aux > 0);

    aux2 = (int)((Math.random()*numDigi)+1);

    do {
      aux3 /= 10;
      aux2--;
    } while (aux2 > 1);
    aux3 %= 10;
    System.out.println(aux3);
    System.out.println();
  }
}
