import paquetes.EjercicioSueltos;
import paquetes.Ejercicio20_28;
import paquetes.Ejercicio29_34;

public class App4 {
  public static void main(String[] args) throws Exception {

    System.out.println("Ejercicio Palotes: ");

    System.out.println("El numero 470213 en el sistema de palotes es: " + EjercicioSueltos.convierteEnPalotes(470213));

    int[] arrayAleatorio = Ejercicio20_28.generaArrayInt(20, 50, 10);
    int[] arrayAleatorio2 = Ejercicio20_28.generaArrayInt(9, 10, 0);
    int[] arrayAleatorio3 = Ejercicio20_28.generaArrayInt(5, 10, 0);
    int[][] arrayAleatorio4 = Ejercicio29_34.generaArrayBiInt(6, 4, 50, 10);
    String[] arrayPalabras = new String[9];

    arrayPalabras[0] = "casa";
    arrayPalabras[1] = "coche";
    arrayPalabras[2] = "sol";
    arrayPalabras[3] = "mesa";
    arrayPalabras[4] = "mesa";
    arrayPalabras[5] = "coche";
    arrayPalabras[6] = "ordenador";
    arrayPalabras[7] = "sol";
    arrayPalabras[8] = "CASA";

    System.out.println("array: ");
    Ejercicio20_28.muestraArray(arrayAleatorio);

    System.out.println("Primos: ");
    Ejercicio20_28.muestraArray(EjercicioSueltos.filtraPrimos(arrayAleatorio));

    System.out.println("Capicuas: ");
    Ejercicio20_28.muestraArray(EjercicioSueltos.filtraCapicuas(arrayAleatorio));

    System.out.println("Ejercicio Palabras: ");

    System.out.println("El numero 470213 en palabras es: " + EjercicioSueltos.convierteEnPalabras(470213));

    System.out.println("Numeros con 7: ");
    Ejercicio20_28.muestraArray(EjercicioSueltos.filtraCon7(arrayAleatorio));

    System.out.println("Array: ");
    Ejercicio20_28.muestraArray(arrayAleatorio2);

    System.out.println("Ejercicio Numeros de array como String: ");

    System.out.println("La cadena es: " + EjercicioSueltos.convierteArrayEnString(arrayAleatorio2));

    System.out.println("Concatenacion de 2 arrays: ");
    Ejercicio20_28.muestraArray(arrayAleatorio2);
    Ejercicio20_28.muestraArray(arrayAleatorio3);

    System.out.println("union: ");
    Ejercicio20_28.muestraArray(EjercicioSueltos.concatena(arrayAleatorio2, arrayAleatorio3));

    System.out.println("Concatenacion de 2 arrays mezclados: ");
    Ejercicio20_28.muestraArray(arrayAleatorio2);
    Ejercicio20_28.muestraArray(arrayAleatorio3);

    System.out.println("union: ");
    Ejercicio20_28.muestraArray(EjercicioSueltos.mezcla(arrayAleatorio2, arrayAleatorio3));

    System.out.println("Ejercicio Numeros aleatorios de un array: ");

    System.out.println("El numero seleccionado es: " + EjercicioSueltos.aleatorioDeArray(arrayAleatorio));

    System.out.println("Array Bidimensional: ");
    Ejercicio29_34.muestraArrayBiInt(arrayAleatorio4);

    System.out.println("Ejercicio posicion de un numero en un array Bidimensional: ");

    System.out.println("El numero seleccionado es: " + EjercicioSueltos.nEsimo(arrayAleatorio4, 5));

    System.out.println("Ejercicio ocurrencias: ");

    System.out.println("Las veces que se repite el 7 son: " + EjercicioSueltos.ocurrencias(37462846, 7));
    System.out.println("Las veces que se repite el 7 son: " + EjercicioSueltos.ocurrencias(arrayAleatorio, 7));

    System.out.println("Ejercicio Palabras sin repetir: ");
    
    Ejercicio20_28.muestraArrayPalabras(EjercicioSueltos.sinRepetir(arrayPalabras));

    Ejercicio20_28.muestraArray(EjercicioSueltos.corteza(arrayAleatorio4));
  }
}
