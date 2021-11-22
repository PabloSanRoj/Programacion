public class Ejercicio31 {
    public static void main(String[] args) {
        
        int altura;

        System.out.println("Este programa muestra una L por pantalla con asteriscos");
        System.out.println("Introduzca la altura de la L: ");
        altura = Integer.parseInt(System.console().readLine());

        for (int i = 1 ; i <= altura - 1 ; i++) {
            System.out.println("*");
        }
        for (int j = 1 ; j <= (altura / 2) + 1 ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
