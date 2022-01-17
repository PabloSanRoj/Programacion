import paquetes.EjercicioSueltos;
import paquetes.Ejercicio20_28;

public class App4 {
  public static void main(String[] args) throws Exception {

    System.out.println("Ejercicio Palotes: ");

    System.out.println("El numero 470213 en el sistema de palotes es: " + EjercicioSueltos.convierteEnPalotes(470213));

    int [] arrayAleatorio = Ejercicio20_28.generaArrayInt(20, 50, 10);

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
  }
}
