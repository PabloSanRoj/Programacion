package paquetes;

public class EjercicioSueltos {

  public static String convierteEnPalotes(long n) {

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

    int [] aux = new int [n.length];
    int [] arrayPrimos;

    int contador = 0;

    for (int j = 0; j < n.length ; j++){
      
      boolean num = Ejercicio1_14.esPrimo(n[j]);

      if (num == true){
        aux[contador] = n[j];
        contador++;
      }
    }

    if (contador == 0) arrayPrimos = new int[] { -1}; 
    else {

      arrayPrimos = new int[contador];
      
      for (int i = 0; i < contador; i++) {
        arrayPrimos[i] = aux[i];
      }
    }
    
    return arrayPrimos;
  }
}
