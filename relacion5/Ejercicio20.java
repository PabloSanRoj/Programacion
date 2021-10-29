public class Ejercicio20 {
    public static void main(String[] args) {
        
        int altura;
        String carac;

        System.out.println("Este programa pinta una pirámide por pantalla");
        System.out.println("Introduzca la altura que quieres que tenga la pirámide");
        altura = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el caracter que quieres que tenga la pirámide");
        carac = System.console().readLine();

        for (int i = 1 ; i <= altura-1 ; i++) {
            for (int esp = 1; esp <= altura-i; esp++){
                System.out.print(" ");
            }
            for (int esp = 0 ; esp < altura ; esp++) {
                if (esp == 0 || esp == altura) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            
        }
        for (int j = 1 ; j <= (altura*2) - 1 ; j++) {
            System.out.print(carac);
        }
        System.out.println();
    }
}