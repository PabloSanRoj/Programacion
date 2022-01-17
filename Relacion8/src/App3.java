import paquetes.Ejercicio20_28;
import paquetes.Ejercicio29_34;

public class App3 {
    public static void main(String[] args) throws Exception {

        System.out.println();

        System.out.println("generaArrayBiInt: ");

        int[][] arrayAleatorio = Ejercicio29_34.generaArrayBiInt(5, 5, 50, 10);

        for (int i = 0; i < arrayAleatorio.length; i++) {
            for (int j = 0; j < arrayAleatorio[i].length; j++) {

                System.out.printf("%2s", arrayAleatorio[i][j] + " ");

            }
            System.out.println();
        }

        System.out.print("¿Que fila desea seleccionar?: ");
        int num = Integer.parseInt(System.console().readLine());

        Ejercicio20_28.muestraArray(Ejercicio29_34.filaDeArrayBiInt(arrayAleatorio, num));

        System.out.print("¿Que columna desea seleccionar?: ");
        int num2 = Integer.parseInt(System.console().readLine());

        Ejercicio20_28.muestraArray(Ejercicio29_34.columnaDeArrayBiInt(arrayAleatorio, num2));

        System.out.print("¿Que numero desea buscar?: ");
        int num3 = Integer.parseInt(System.console().readLine());

        System.out.println(
                "Las coordenadas del numero son: " + Ejercicio29_34.coordenadasEnArrayBiInt(arrayAleatorio, num3));

        
        Ejercicio29_34.muestraArrayBiInt(arrayAleatorio);
        System.out.println("Busca los puntos de silla: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Ejercicio29_34.esPuntoDeSilla(arrayAleatorio, i, j)) {
                    System.out.println("fila " + i + ", columna " + j + " -> " + arrayAleatorio[i][j]);
                }
            } 
        }

        System.out.println("Diagonal: ");
        Ejercicio20_28.muestraArray(Ejercicio29_34.diagonal(arrayAleatorio, 5, 5, "nose"));

        System.out.println();

    }
}
