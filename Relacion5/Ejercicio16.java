public class Ejercicio16 {
    public static void main(String[] args) {
        
        int prim;
        String result = "Primo";

        System.out.println("Este programa te dice si tu numero es primo");
        System.out.println("Introduzca un numero: ");
        prim = Integer.parseInt(System.console().readLine());

        for (int i = 2 ; i < prim ; i++) {
            if (prim % i == 0) {
                result = "No Primo";
            }
        }
        System.out.println("Tu numero es: " + result);
    }

}
