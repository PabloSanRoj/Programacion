public class Ejercicio24 {
    public static void main(String[] args) {
        
        System.out.println("Este programa pinta una pirámide con una serie de números y esa serie va a ser la altura");
        System.out.println("Introduzca el número de filas de la pirámide");
        int altcarac = Integer.parseInt(System.console().readLine());

        int altura = 1;
        int i = 0;
        int espacios = altcarac -1;

        
    
        while (altura <= altcarac) {
            for (i = 1 ; i <= espacios ; i++) {
                System.out.print(" ");
            }
            for (i = 1 ; i < altura ; i++) {
                System.out.print(i);
            }
            for (i = altura ; i > 0 ; i--) {
                System.out.print(i);
            }
            System.out.println();
            altura++;
            espacios--;
        }
    
    }
}
