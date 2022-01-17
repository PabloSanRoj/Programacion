package paquetes;

public class EjercicioSueltos {

  public static String convierteEnPalotes(int n) {

    String cadena = "";

    int numDigi = Ejercicio1_14.digitos(n);

    do {

      long aux = Ejercicio1_14.quitaPorDelante(n, numDigi - 1);

      if (aux == 0) {
        cadena = "-" + cadena;
      } else {
        for (int i = 0; i < aux; i++) {
          cadena = "|" + cadena;

        }
        if (numDigi == 1) {

        } else {
          cadena = "-" + cadena;
        }
      }

      n = Ejercicio1_14.quitaPorDetras(n, 1);
      numDigi--;

    } while (numDigi > 0);

    return cadena;

  }

  public static int[] filtraPrimos(int n[]) {

    int[] aux = new int[n.length];
    int[] arrayPrimos;

    int contador = 0;

    for (int j = 0; j < n.length; j++) {

      boolean num = Ejercicio1_14.esPrimo(n[j]);

      if (num == true) {
        aux[contador] = n[j];
        contador++;
      }
    }

    if (contador == 0)
      arrayPrimos = new int[] { -1 };
    else {

      arrayPrimos = new int[contador];

      for (int i = 0; i < contador; i++) {
        arrayPrimos[i] = aux[i];
      }
    }

    return arrayPrimos;
  }

  public static int[] filtraCapicuas(int n[]) {

    int[] aux = new int[n.length];
    int[] arrayCapicuas;

    int contador = 0;

    for (int j = 0; j < n.length; j++) {

      boolean num = Ejercicio1_14.esCapicua(n[j]);

      if (num == true) {
        aux[contador] = n[j];
        contador++;
      }
    }

    if (contador == 0)
      arrayCapicuas = new int[] { -1 };
    else {

      arrayCapicuas = new int[contador];

      for (int i = 0; i < contador; i++) {
        arrayCapicuas[i] = aux[i];
      }
    }

    return arrayCapicuas;
  }

  public static String convierteEnPalabras(int n) {

    String cadena = "";

    int numDigi = Ejercicio1_14.digitos(n);

    String[] numeros = new String[10];

    numeros[0] = "cero";
    numeros[1] = "uno";
    numeros[2] = "dos";
    numeros[3] = "tres";
    numeros[4] = "cuatro";
    numeros[5] = "cinco";
    numeros[6] = "seis";
    numeros[7] = "siete";
    numeros[8] = "ocho";
    numeros[9] = "nueve";

    do {

      int aux = Ejercicio1_14.quitaPorDelante(n, numDigi - 1);

      if (numDigi == 1) {
        cadena = numeros[aux] + cadena;
      } else {
        cadena = ", " + numeros[aux] + cadena;
      }

      n = Ejercicio1_14.quitaPorDetras(n, 1);
      numDigi--;

    } while (numDigi > 0);

    return cadena;

  }

  public static int[] filtraCon7(int n[]) {

    int[] aux = new int[n.length];
    int[] arraySietes;

    int contador = 0;

    for (int j = 0; j < n.length; j++) {

      int num = Ejercicio1_14.posiciondeDigito(n[j], 7);

      if (num == -1) {

      } else {
        aux[contador] = n[j];
        contador++;
      }
    }

    if (contador == 0)
      arraySietes = new int[] { -1 };
    else {

      arraySietes = new int[contador];

      for (int i = 0; i < contador; i++) {
        arraySietes[i] = aux[i];
      }
    }

    return arraySietes;
  }

  public static String convierteArrayEnString(int[] n) {

    String cadena = "";

    for (int i = 0; i < n.length; i++) {
      cadena = cadena + n[i];
    }

    return cadena;

  }

  public static int[] concatena(int[] n, int[] x) {

    int[] concatenacion = new int[n.length + x.length];

    int contador = 0;

    for (int i = 0; i < n.length; i++) {
      concatenacion[contador] = n[i];
      contador++;
    }
    for (int i = 0; i < x.length; i++) {
      concatenacion[contador] = x[i];
      contador++;
    }

    return concatenacion;

  }

  public static int[] mezcla(int[] n, int[] x) {

    int[] concatenacion = new int[n.length + x.length];

    int contador1 = 0, contador2 = 0;

    for (int i = 0; i < n.length + x.length; i++)

      if ((i % 2 == 0 && contador1 != n.length) || contador2 == x.length) {

        concatenacion[i] = n[contador1];
        contador1++;

      } else if ((i % 2 != 0 && contador2 != x.length) || contador1 == n.length) {

        concatenacion[i] = x[contador2];
        contador2++;
      }

    return concatenacion;

  }

  public static int aleatorioDeArray(int[] n) {

    int seleccion = 0;

    int num = (int) (Math.random()*n.length);

    seleccion = n[num];

    return seleccion;

  }
}
