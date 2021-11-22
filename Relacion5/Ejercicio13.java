public class Ejercicio13 {
    public static void main(String[] args) {
        
        int num;
        int posi = 0;
        int nega = 0;

        System.out.println ("Este programa dice cuantos numeros son positivos y cuantos negativos");
        System.out.println ("Por favor introduzca 10 números: ");

        for (int i = 1 ; i <= 10 ; i++) {
            num = Integer.parseInt(System.console().readLine());
            
            if (num >= 0) {
                posi++;
            } else if (num < 0) {
                nega++;
            }
        }

        System.out.println ("Hay: " + posi + " numeros positivos y " + nega + " negativos");
    }
}