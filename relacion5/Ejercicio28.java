public class Ejercicio28 {
    public static void main(String[] args) {
        
        int num;
        int total = 1;

        System.out.println("Este programa muestra el factorial de un número introducido por pantalla");
        System.out.println("Introduzca un número");
        num = Integer.parseInt(System.console().readLine());

        for (int i = 2 ; i <= num ; i++) {
            total = total * i; 
        }
        System.out.println("" + num + "! = " + total);
    }
}
