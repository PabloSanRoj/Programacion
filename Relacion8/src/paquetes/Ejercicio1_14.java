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

  public static int potencia(int base, int exponente) {

    int numero = 1;

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

  public static int digitoN(int numero, int numQuita) {

    int num;
    int numdigi;

    
      num = quitaPorDelante(numero, numQuita);
    
      numdigi = digitos(num);
      numQuita = numdigi - 1;

      num = quitaPorDetras(num, numQuita);

    return num;
  }

  public static int quitaPorDelante(int numero, int numQuita) {

    return numero % potencia(10, digitos(numero) - numQuita);

  }

  public static int quitaPorDetras(int numero, int numQuita) {

    for (long i = numQuita ; i > 0 ; i--){
      numero /= 10;
    }

    return numero;

  }

  public static int pegaPorDetras(int numero, int numeroPega) {

    int numDigi;
    int num;

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

  public static int posiciondeDigito(int numero, int ocurrencia) {

    boolean salir = false;
    int num, contador = 0, cambiar = 0;
    int posicion = 0;;

    do{

      for (int i = numero ; i > 0 ; i /= 10){
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

  public static int trozoDeNumero(int numero) {

    int num, num2; 
    int numDigi;

    numDigi = digitos(numero);

    num = quitaPorDelante(numero, numDigi - 1);

    num2 = quitaPorDetras(numero, numDigi - 1);

    numero = (num2 * 10) + num;

    return numero;

  }

  public static long juntaNumeros(int numero, int numeroPega) {

    int numDigi;
    int num;

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

  public static long pegaPorDelante(int numero, long numeroPega) {

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
