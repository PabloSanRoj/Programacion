public class Ejercicio23 {
    public static void main(String[] args) {
        
        double num;
        double suma = 0;
        int i = 0;
        double media = 0;

        System.out.println("Este programa permite meter números hasta que la suma de ellos de 10000");
        System.out.println("Introduzca números");

        for(i = 0 ; suma <= 10000 ; i++) {
            num = Double.parseDouble(System.console().readLine());
            suma = suma + num;
        }

        media = suma / i;
        System.out.printf("La suma de estos números es: %d\n" , (int) suma);
        System.out.println("Se han introducido: " + i);
        System.out.printf("La media de los números es: %.2f\n" , media);
    }
}
