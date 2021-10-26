public class Ejercicio18 {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int suma = 0;


        System.out.println("Este programa te dice numeros entre 2 numeros de 7 en 7");
        System.out.println("Introduzca numero 1: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca numero 2: ");
        num2 = Integer.parseInt(System.console().readLine());

        if ( num1 == num2 ) {
            System.out.println("Has introducido 2 numeros iguales por lo tanto ha acabado el programa");
        } else if (( num1 != num2 ) && (num1 < num2)) {
            System.out.println("Los numeros son: " );
            for (int i = num1 ; i <= num2 ; i = i + 7) {
                System.out.println(i);
            }
        } else if (( num1 != num2 ) && (num2 < num1)) {
            System.out.println("Los numeros son: " );
            for (int i = num2 ; i <= num1 ; i = i + 7) {
                System.out.println(i);
            }
        }
    }
}
