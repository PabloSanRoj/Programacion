public class Ejercicio29 {
    public static void main(String[] args) {
        
        int num;
        int divisor;

        System.out.println("Este programa muestra todos los números enteros positivos menores que un número introducido por teclado y divisible entre otro número");
        System.out.println("Introduzca el número tope: ");
        num = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el número divisor: ");
        divisor = Integer.parseInt(System.console().readLine());

        for (int i = 0 ; i <= num ; i++) {
            if (i % divisor != 0) {
                System.out.println(i);
            }
        }
    }
}
