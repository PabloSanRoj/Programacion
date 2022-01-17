import paquetes.EjercicioSueltos;
import paquetes.Ejercicio20_28;

public class App4 {
  public static void main(String[] args) throws Exception {

    System.out.println("Ejercicio Palotes: ");

    System.out.println("El numero 470213 en el sistema de palotes es: " + EjercicioSueltos.convierteEnPalotes(470213));

    int [] arrayAleatorio = Ejercicio20_28.generaArrayInt(20, 50, 10);

    System.out.println("Ejercicio filtra primos, array: ");
    Ejercicio20_28.muestraArray(arrayAleatorio);

    System.out.println("Primos: ");
    Ejercicio20_28.muestraArray(EjercicioSueltos.filtraPrimos(arrayAleatorio));
  }
}
