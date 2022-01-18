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

  public static int nEsimo(int[][] n, int posicion) {

    int seleccion = 0, contador = 0;

    for (int i = 0; i < n.length; i++){
      for (int j = 0; j < n[i].length; j++){
        if (contador == posicion){
          seleccion = n[i][j];
        }
        contador++;
      }
    }

    return seleccion;

  }

  public static int ocurrencias(int numero, int ocurrencia) {

    int num, contador = 0, cambiar = 0;
    int posicion = 0;;

      for (int i = numero ; i > 0 ; i /= 10){
        num = i % 10;

        if (num == ocurrencia){
          contador++;
          cambiar = 1;
        }
      }

    posicion = contador;
    if (cambiar == 0){
      posicion = -1;
    }

    return posicion;

  }

  public static int ocurrencias(int[] numero, int ocurrencia) {

    int num, contador = 0, cambiar = 0;
    int posicion = 0;;

    for (int j = 0; j < numero.length; j++){
      for (int i = numero[j] ; i > 0 ; i /= 10){
        num = i % 10;

        if (num == ocurrencia){
          contador++;
          cambiar = 1;
        }
      }
    }

    posicion = contador;
    if (cambiar == 0){
      posicion = -1;
    }

    return posicion;

  }

  public static String[] sinRepetir(String[] s){

    int contador = 1, contador2 = 1;

    
    String [] palabrasCompara = new String [s.length];

    for (int i = 0; i < s.length; i++){
      palabrasCompara[i] = s[i];
    }

    for (int i = 0; i < s.length; i++) {
      int posicion = 0;
      if (i == 0) {
        
      } else {
        for (int j = 0; j < i; j++) {
          if (palabrasCompara[i].equals(s[j]) && j != i) {
            posicion = 1;
          }
        }
        if (posicion == 0){
        contador2++;
        } else {

        }
      }
    }

    String [] cadenaSinRepe = new String [contador2];

    for (int i = 0; i < s.length; i++) {
      int posicion = 0;
      if (i == 0) {
        cadenaSinRepe[i] = s[i];
      } else {
        for (int j = 0; j < i; j++) {
          if (palabrasCompara[i].equals(s[j]) && j != i) {
            posicion = 1;
          }
        }
        if (posicion == 0){
        cadenaSinRepe[contador] = s[i];
        contador++;
        } else {

        }
      }
    }

    return cadenaSinRepe;
  }

  public static int[] corteza(int[][] n){

    int contador = 0;

    int[] cortezaExterior = new int [16];

    for (int i = 0; i < n.length; i++){
      cortezaExterior[contador] = n[0][i];
      contador++;
    }

    for (int i = 1; i < n.length ; i++){
      cortezaExterior[contador] = n[i][n.length];
      contador++;
    }

    for (int i = n.length - 1 ; i >= 0 ; i--){
      cortezaExterior[contador] = n[n.length][i];
      contador++;
    }

    for (int i = n.length - 1; i > 0; i--){
      cortezaExterior[contador] = n[i][0];
      contador++;
    }

    return cortezaExterior;
  }
}
