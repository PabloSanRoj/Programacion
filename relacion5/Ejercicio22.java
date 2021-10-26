public class Ejercicio22 {
    public static void main(String[] args) {
        
        boolean primo;

        System.out.println("Este programa muestra todos los números primos entre 2 y 100");

        for (int i = 2 ; i <= 100 ; i++) {
            int j = 2; 
            primo = true;

            do {
                if ( i % j == 0 && i != j) {
                    primo = false;
                } 
                j++;
            } while (primo && j <= i / 2);

            if (primo) {
                System.out.println(i);
            }
        }
    }
}
