public class Ejercicio15 {
    public static void main(String[] args) {
        
        int base;
        int expo;
        int result = 1;

        System.out.println ("Este programa muestra el numero de potencias que quieras introducir");
        System.out.println ("Introduzca una base: ");
        base = Integer.parseInt(System.console().readLine());
        System.out.println ("Introduzca un exponente: ");
        expo = Integer.parseInt(System.console().readLine());

        for (int i = 1 ; i <= expo ; i++) {
            result = 1;
            for (int j = 0 ; j < i ; j++) {
            result = result * base;
            }
            System.out.println ("" + base + " Expo " + i + " = " + result);
            base++;
        }
    
    }

}
