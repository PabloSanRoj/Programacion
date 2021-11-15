/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.*/

public class Ejercicio14Tema6 {
  public static void main(String[] args) {

    int num, ale;
    String mayMen;

    System.out.println();
    System.out.print("Introduzca el número en el que estas pensando: ");
    num = Integer.parseInt(System.console().readLine());

    System.out.println();
    System.out.println("El programa tiene " + 5 + " oportunidades");
    ale = (int) (Math.random() * 101);
    System.out.println(ale);
    System.out.println();
    if (ale == num) {
      System.out.println("El programa ha acertado tu número puesto que tu número era " + ale);
    } else {
      for (int i = 4; i > 0; i--) {
        System.out.println();
        System.out.println("El programa tiene " + i + " oportunidades");
        System.out
            .println("Introduce si el número que te ha dado el programa es Mayor o Menor (La primera letra mayúscula)");
        mayMen = System.console().readLine();
        switch (mayMen) {
        case "Mayor":
          ale = (int) (Math.random() * ale);
          System.out.println(ale);
          System.out.println();
          if (ale == num) {
            System.out.println("El programa ha acertado tu número puesto que tu número era " + ale);
            i = -1;
          }
          break;
        case "Menor":
          ale = (int) ((Math.random() * (101 - ale)) + ale);
          System.out.println(ale);
          System.out.println();
          if (ale == num) {
            System.out.println("El programa ha acertado tu número puesto que tu número era " + ale);
            i = -1;
          }
        }
      }
    }
    System.out.println("Felicidades el programa no acertó tu número");
  }
}
