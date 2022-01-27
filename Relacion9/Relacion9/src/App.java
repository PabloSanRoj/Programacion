import paquetes.PiramideHueca;

public class App {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la primera piramide: ");
        int altura = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el caracter de la primera piramide: ");
        String caracter = System.console().readLine();

        System.out.println();

        System.out.print("Introduzca la altura de la segunda piramide: ");
        int altura2 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el caracter de la segunda piramide: ");
        String caracter2 = System.console().readLine();

        PiramideHueca primeraPiramide;
        PiramideHueca segundaPiramide;

        /*primeraPiramide = new PiramideHueca (caracter, altura);
        segundaPiramide = new PiramideHueca (caracter2, altura2);

        System.out.println();

        System.out.print(primeraPiramide.toString());
        System.out.println();
        System.out.print(segundaPiramide);*/
    }
}
