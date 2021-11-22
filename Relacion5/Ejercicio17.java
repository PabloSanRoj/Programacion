public class Ejercicio17 {
    public static void main(String[] args) {
        
        int num;
        int suma = 0;

        System.out.println("Este programa te dice si los 100 siguientes numeros son positivos");
        System.out.println("Introduzca un numero");
        num = Integer.parseInt(System.console().readLine());

        if (num < 0 ) {
            System.out.println("Tu numero es negativo");
        } else {
        for (int i = num ; i <= num + 100 ; i++ ) {
            suma = suma + i;
            System.out.println("numero " + i);
            System.out.println("suma " + suma);
            
        }
        System.out.println ("La suma es: " + suma);
        }
    }
}
