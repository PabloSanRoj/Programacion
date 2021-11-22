public class Ejerciciox {
    public static void main(String[] args) {
        
        int entrada;
        int numero = 0;


        System.out.println("Este programa pinta el número al reves");
        System.out.println("Introduzca el numero");
        entrada = Integer.parseInt(System.console().readLine());

        for (int i = entrada ; i > 0 ; i /= 10) { 
            numero *= 10;
            numero += i % 10;
        }
        System.out.println("El numero " + entrada + " al reves es: " + numero);
    }
}
