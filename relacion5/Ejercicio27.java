public class Ejercicio27 {
    public static void main(String[] args) {
        
        int num;
        int conta = 0;
        int suma = 0;

        System.out.println("Este programa muestra los multiplos de 3, los cuenta y los suma");
        System.out.println("Introduzca un número hasta el que quiere que se muestren los multiplos de 3");
        num = Integer.parseInt(System.console().readLine());
        System.out.println(" ");
        System.out.println("Los multiplos son los siguientes: ");
        System.out.println(" ");
        for (int i = 1 ; i <= num ; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                conta++;
                suma += i;
            }
        }
        System.out.println("Hay " + conta + " multiplos de 3 y todos ellos juntos suman " + suma);
    }
}
