public class Ejercico25 {
    public static void main(String[] args) {
        
        int num;
        int numDigi= 1;
        int numConver;

        System.out.println("Este programa pone el número introducido al reves");
        System.out.println("Introduzca un número: ");
        num = Integer.parseInt(System.console().readLine());

        numConver = num;

        if (numConver < 10 && numConver > -10) {
            System.out.println("El número introducido es de un solo dígito: " + num );
        } else {
            while (numConver > 0) {
                numConver/= 10;
                numDigi++;
            }
            
        }
    }
}
