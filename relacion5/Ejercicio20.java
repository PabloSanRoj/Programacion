public class Ejercicio20 {
    public static void main(String[] args) {
        
        int altura;
        String carac;

        System.out.println("Este programa pinta una pirámide por pantalla");
        System.out.println("Introduzca la altura que quieres que tenga la pirámide");
        altura = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el caracter que quieres que tenga la pirámide");
        carac = System.console().readLine();

        for (int i = 1 ; i <= altura ; i++) {
            for (int esp = 1; esp <= altura-i; esp++){
                System.out.print(" ");
            }
                System.out.print(carac);
                
            System.out.println();
        }
    }
}