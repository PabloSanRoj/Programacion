import paquetes.Ejercicio20_28;

public class App2 {
  public static void main(String[] args) throws Exception {
    
    System.out.println();

    System.out.println("generaArrayInt: ");

    int [] arrayAleatorio = Ejercicio20_28.generaArrayInt(20, 50, 5);

    for (int i = 0; i < arrayAleatorio.length ; i++){
      System.out.print(arrayAleatorio[i] + " ");
    }

    System.out.println();
    System.out.println();

    System.out.println("El minimo del array es: " + Ejercicio20_28.minimoArrayInt(arrayAleatorio));
    System.out.println("El maximo del array es: " + Ejercicio20_28.maximoArrayInt(arrayAleatorio));
    System.out.println("La media del array es: " + Ejercicio20_28.mediaArrayInt(arrayAleatorio));

    System.out.println();

    System.out.print("Introduzca un numero para saber si esta o no en el array: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("¿Tu numero esta?: " + Ejercicio20_28.estaEnArrayInt(arrayAleatorio, num));

    System.out.println();

    System.out.print("Introduzca un numero para saber en que posicion se encuentra: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.println("Tu numero esta en la posicion: " + Ejercicio20_28.posicionEnArray(arrayAleatorio, num2));

    System.out.println();

    System.out.print("El array volteado es: ");
    Ejercicio20_28.muestraArray(Ejercicio20_28.volteaArrayInt(arrayAleatorio));

    System.out.println();
    
    System.out.print("Introduzca el numero de veces que quieres rotar el array: ");
    int num3 = Integer.parseInt(System.console().readLine());

    System.out.print("El array rotado a la derecha es: ");
    Ejercicio20_28.muestraArray(Ejercicio20_28.rotaDerechaArrayInt(arrayAleatorio, num3));

    System.out.println();

    System.out.print("Introduzca el numero de veces que quieres rotar el array: ");
    int num4 = Integer.parseInt(System.console().readLine());

    System.out.print("El array rotado a la izquierda es: ");
    Ejercicio20_28.muestraArray(Ejercicio20_28.rotaIzquierdaArrayInt(arrayAleatorio, num4));

    System.out.println();
  }
}
