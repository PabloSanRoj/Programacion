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

  public static int digitos(long numero) {

    int numeroDigi = 0;

    for (long i = numero; i > 0; i /= 10) {
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

  public static long digitoN(long numero, int numQuita) {

    long num;
    int numdigi;

    
      num = quitaPorDelante(numero, numQuita);
    
      numdigi = digitos(num);
      numQuita = numdigi - 1;

      num = quitaPorDetras(num, numQuita);

    return num;
  }

  public static long quitaPorDelante(long numero, int numQuita) {

    return numero % potencia(10, digitos(numero) - numQuita);

  }

  public static long quitaPorDetras(long numero, int numQuita) {

    for (long i = numQuita ; i > 0 ; i--){
      numero /= 10;
    }

    return numero;

  }

  public static long pegaPorDetras(long numero, long numeroPega) {

    int numDigi;
    long num;

    numDigi = digitos(numeroPega);

    for (int i = numDigi ; i > 0 ; i--){

    num = quitaPorDetras(numeroPega, numDigi - 1);
    numero *= 10;
    numero = numero + num;
    numDigi--;
    numeroPega = numeroPega % potencia(10, digitos(numeroPega) - 1);
    }
    return numero;

  }

  public static long posiciondeDigito(long numero, long ocurrencia) {

    boolean salir = false;
    long num, contador = 0, cambiar = 0;
    long posicion = 0;;

    do{

      for (long i = numero ; i > 0 ; i /= 10){
        num = i % 10;

        if (num == ocurrencia){
          posicion = contador;
          cambiar = 1;
          salir = true;
        }
        contador++;
      }
      salir = true;
      
    } while (salir == false);
    
    if (cambiar == 0){
      posicion = -1;
    }

    return posicion;

  }

  public static long trozoDeNumero(long numero) {

    long num, num2; 
    int numDigi;

    numDigi = digitos(numero);

    num = quitaPorDelante(numero, numDigi - 1);

    num2 = quitaPorDetras(numero, numDigi - 1);

    numero = (num2 * 10) + num;

    return numero;

  }

  public static long juntaNumeros(long numero, long numeroPega) {

    int numDigi;
    long num;

    numDigi = digitos(numeroPega);

    for (int i = numDigi ; i > 0 ; i--){

    num = quitaPorDetras(numeroPega, numDigi - 1);
    numero *= 10;
    numero = numero + num;
    numDigi--;
    numeroPega = numeroPega % potencia(10, digitos(numeroPega) - 1);
    }
    return numero;

  }

  public static long pegaPorDelante(long numero, long numeroPega) {

    int numDigi;
    long num;

    numDigi = digitos(numero);

    for (int i = numDigi ; i > 0 ; i--){

    num = quitaPorDetras(numero, numDigi - 1);
    numeroPega *= 10;
    numeroPega = numeroPega + num;
    numDigi--;
    numero = numero % potencia(10, digitos(numero) - 1);
    }
    return numeroPega;

  }
}
