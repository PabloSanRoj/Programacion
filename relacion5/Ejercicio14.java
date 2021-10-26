public class Ejercicio14 {
    public static void main(String[] args) {

        int base;
        int expo;
        int result = 1;
        
        System.out.println ("Este programa calcula la potencia");
        System.out.println ("Por favor introduzca una base");
        base = Integer.parseInt(System.console().readLine());
        System.out.println ("Por favor introduzca un exponente (Positivo)");
        expo = Integer.parseInt(System.console().readLine());
        
        for (int i = 1; i <= expo; i++){
            result = result * base;
        }
        System.out.println(result); 
    }


}
