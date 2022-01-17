package paquetes;

public class Ejercicio29_34 {

    public static void muestraArrayBiInt(int numero[][]) {

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                System.out.print(numero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generaArrayBiInt(int filas, int columnas, int min, int max) {

        int[][] arrayGeneral = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arrayGeneral[i][j] = (int) ((Math.random() * (max - min)) + min);
            }
        }

        return arrayGeneral;
    }

    public static int[] filaDeArrayBiInt(int numero[][], int num) {

        int[] filas = new int[numero[0].length];

        for (int i = 0; i < numero[0].length; i++) {
            filas[i] = numero[num][i];
        }

        return filas;
    }

    public static int[] columnaDeArrayBiInt(int numero[][], int num) {

        int[] columnas = new int[numero[0].length];

        for (int i = 0; i < numero[0].length; i++) {
            columnas[i] = numero[i][num];
        }

        return columnas;
    }

    public static String coordenadasEnArrayBiInt(int numero[][], int num) {

        int posicionfila = -1, posicioncolumna = -1;
        String posiciontotal = "";
        boolean salir = false;

        do {
            for (int i = 0; i < numero.length; i++) {
                for (int j = 0; j < numero[i].length; j++) {
                    if (numero[i][j] == num) {
                        posicionfila = i;
                        posicioncolumna = j;
                        salir = true;
                    }
                }
            }
            salir = true;
        } while (salir == false);

        posiciontotal = "{" + posicionfila + ", " + posicioncolumna + "}";
        return posiciontotal;
    }

    public static boolean esPuntoDeSilla(int numero[][], int num, int num2) {

        int[] fila = filaDeArrayBiInt(numero, num);
        int[] columna = columnaDeArrayBiInt(numero, num2);

        return ((Ejercicio20_28.minimoArrayInt(fila) == numero[num][num2])
                && (Ejercicio20_28.maximoArrayInt(columna) == numero[num][num2]));
    }

    public static int[] diagonal(int numero[][], int fila2, int columna2, String direccion) {

        int elementos = 0;
        int[] diagonalAux = new int[1000];

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[0].length; j++) {
                if ((((columna2 - j) == (fila2 - i)) && (direccion.equals("nose")))
                        || (((columna2 - j) == (i - fila2)) && (direccion.equals("neso")))) {
                    diagonalAux[elementos++] = numero[i][j];
                }
            }
        }
        int[] diagonal = new int[elementos];
        for (int j = 0; j < elementos; j++) {
            diagonal[j] = diagonalAux[j];
        }

        return diagonal;
    }
}
