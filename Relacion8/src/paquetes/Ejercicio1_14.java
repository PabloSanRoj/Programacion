package paquetes;

public class Ejercicio1_14 {

  public static boolean esPrimo(int numero) {

    boolean result = true;

    for (int i = 2; i <= Math.sqrt(numero) && result; i++) {
      if (numero % i == 0) {
        result = false;
      }
    }

    return result;
  }

  public static int siguientePrimo(int numero) {
    int j = numero;

    do {
    j++;
    } while (!esPrimo(j));
    return j;
  }

  public static long digitos(int numero) {

    int numeroDigi = 0;

    for (int i = numero; i > 0; i /= 10) {
      numeroDigi++;
    }

    return numeroDigi;
  }

  public static long potencia(int base, int exponente) {

    long numero = 1;

    for (int i = 1; i <= exponente; i++) {
      numero = numero * base;
    }

    return numero;
  }

  public static int voltea(long num) {

    int numero = 0;

    for (long i = num; i > 0; i /= 10) {
      numero *= 10;
      numero += i % 10;
    }

    return numero;
  }

  public static boolean esCapicua(int numero) {

    return numero == voltea(numero);

  }

  public static long digitoN(int numero) {

    return numero;

  }
}
