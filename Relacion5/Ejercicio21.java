public class Ejercicio21 {
    public static void main(String[] args) {
        
        float num;
        float i;
        float contador = 0;
        float media = 0;
        float conta = 0;
        float mayor = 0;

        System.out.println("Este programa te muestra la media de los números impares introducidos y el mayor de los pares (Para salir número negativo)");
        System.out.println("Por favor introduzca números");
    
        for (i = 0 ; i >= 0 && contador >= 0; i++) {
            num = Integer.parseInt(System.console().readLine());
        if (num < 0 ) {
            contador = -1;
        } else if ((num % 2) != 0 ) {
            media = media + num;
            conta++;
        } else if ((num % 2) == 0 ) {
            mayor = num;
            
        } else if (num > mayor) {
            mayor = num;
        }
        }

        media = media / conta;

        System.out.printf("Has introducido: %.0f Números\n" , (i - 1));
        System.out.printf("La media de los números impares es: %.2f\n" , media );
        System.out.printf("El numero más grande entre los pares es: %.0f\n" , mayor);
    }
}