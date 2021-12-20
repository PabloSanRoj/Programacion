/* Pablo Sánchez Rojas */

public class Ex24psr3 {
  public static void main(String[] args) {

    int num, numeroSeleccionado, eleccion;
    String numeroAleatorio = "";

    int[] MatrizUni = new int[5];

    MatrizUni[0] = 12345;
    MatrizUni[1] = 67890;
    MatrizUni[2] = 24680;
    MatrizUni[3] = 13579;
    MatrizUni[4] = 34567;

    num = (int) (Math.random() * 5);

    numeroSeleccionado = MatrizUni[num];
    int aux = numeroSeleccionado;

    for (int i = aux; i > 0; i = i / 10) {
      int z = i % 10;
      num = (int) (Math.random() * 2);
      switch (num) {
        case 0:
          numeroAleatorio = z + numeroAleatorio;
          break;
        case 1:
          numeroAleatorio = numeroAleatorio + z;
          break;
        default:
      }
    }

    for (int i = 5; i >= 0; i--) {
      if (i == 0) {
        System.out.println("Te has quedado sin intentos.");
      } else {
        System.out.print("Tienes " + i + " intentos. Diga número con los dígitos '" + numeroAleatorio + "': ");
        eleccion = Integer.parseInt(System.console().readLine());

        if (eleccion == numeroSeleccionado) {
          i = -1;
          System.out.println("Felicidades. Ha acertado el número.");
        }
      }
    }
  }
}
