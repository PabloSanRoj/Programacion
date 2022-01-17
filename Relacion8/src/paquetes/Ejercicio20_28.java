package paquetes;

public class Ejercicio20_28 {

  public static void muestraArray(int numero[]) {
    for (int i = 0; i < numero.length; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println();
  }

  public static int[] generaArrayInt(int numero, int min, int max) {

    int[] arrayGeneral = new int[numero];

    for (int i = 0; i < numero; i++) {
      arrayGeneral[i] = (int) ((Math.random() * (max - min)) + min);
    }

    return arrayGeneral;
  }

  public static int minimoArrayInt(int[] numero) {

    int minimo = Integer.MAX_VALUE;

    for (int n : numero) {
      if (n < minimo) {
        minimo = n;
      }
    }

    return minimo;
  }

  public static int maximoArrayInt(int[] numero) {

    int maximo = Integer.MIN_VALUE;

    for (int n : numero) {
      if (n > maximo) {
        maximo = n;
      }
    }

    return maximo;
  }

  public static int mediaArrayInt(int[] numero) {

    int media = 0, contador = 0;

    for (int n : numero) {
      contador++;
      media += n;
    }

    media = media / contador;

    return media;
  }

  public static boolean estaEnArrayInt(int[] numero, int num) {

    boolean result = false;

    for (int n : numero) {
      if (num == n) {
        result = true;
      }
    }

    return result;
  }

  public static int posicionEnArray(int[] numero, int num) {

    for (int i = 1; i <= numero.length; i++) {
      if (numero[i] == num) {
        return i;
      }
    }

    return -1;
  }

  public static int[] volteaArrayInt(int[] numero) {

    int[] array = new int[numero.length];

    for (int i = 0; i < numero.length; i++) {
      array[(numero.length - 1) - i] = numero[i];
    }

    return array;
  }

  public static int[] rotaDerechaArrayInt(int[] numero, int num) {

    int[] array = numero.clone();

    int aux;

    for (int j = 0; j < num ; j++){
      aux = array[array.length - 1];
      for (int i = array.length - 1; i > 0; i--) {

        array[i] = array[i - 1];
        
      }
      array[0] = aux;
    }
    return array;
  }

  public static int[] rotaIzquierdaArrayInt(int[] numero, int num) {

    int[] array = numero.clone();

    int aux;

    for (int j = 0; j < num ; j++){
      aux = array[0];
      for (int i = 0; i < array.length - 1; i++){

        array[i] = array[i + 1];
        
      }
      array[array.length - 1] = aux;
    }
    return array;
  }
}