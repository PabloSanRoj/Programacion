/* Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado. */

public class Ejercicio14Tema7_1 {
  public static void main(String[] args) {

    String[] colores = new String[9];
    String[] palabras = new String[8];
    String[] palabras2 = new String[8];

    colores[0] = "verde";
    colores[1] = "rojo";
    colores[2] = "azul";
    colores[3] = "amarillo";
    colores[4] = "naranja";
    colores[5] = "rosa";
    colores[6] = "negro";
    colores[7] = "blanco";
    colores[8] = "morado";

    System.out.println("Introduzca 8 palabras: ");
    for (int i = 0; i < 8; i++) {
      System.out.print("Indice " + i + ": ");
      palabras[i] = System.console().readLine();
    }
    int k = 0;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 9; j++) {
        if (palabras[i].equals(colores[j])) {
          palabras2[k] = palabras[i];
          k++;
        }
      }
    }
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j <= 9; j++) {
        if (j == 9) {
          palabras2[k] = palabras[i];
          k++;
        } else if (palabras[i].equals(colores[j])) {
          j = 10;
        }
      }
    }
    System.out.println();
    System.out.println("Ahora el orden primero colores después lo demas es: ");
    for (int i = 0; i < 8; i++) {
      System.out.println("Indice " + i + ": " + palabras2[i]);
    }
  }
}
