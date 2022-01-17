import paquetes.Ejercicio1_14;

public class App {
    public static void main(String[] args) throws Exception {

        String salir = "no";

        do{

        System.out.println();
        System.out.println("Menu de opciones funciones parte 1: ");
        System.out.println("1. Ejercicio esCapicua.");
        System.out.println("2. Ejercicio esPrimo.");
        System.out.println("3. Ejercicio siguientePrimo.");
        System.out.println("4. Ejercicio potencia.");
        System.out.println("5. Ejercicio digitos.");
        System.out.println("6. Ejercicio voltea.");
        System.out.println("7. Ejercicio digitoN.");
        System.out.println("8. Ejercicio posicionDeDigito.");
        System.out.println("9. Ejercicio quitaPorDetras.");
        System.out.println("10. Ejercicio quitaPorDelante.");
        System.out.println("11. Ejercicio pegaPorDetras.");
        System.out.println("12. Ejercicio pegaPorDelante.");
        System.out.println("13. Ejercicio trozoNumero.");
        System.out.println("14. Ejercicio juntaNumeros.");
        
        System.out.println();
        System.out.print("Selecciona una opcion: ");
        int selec = Integer.parseInt(System.console().readLine());
        
        System.out.println();

        switch (selec){
            case 1:
                System.out.println("Introduzca un numero para comprobar si es capicua: ");
                int num = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.esCapicua(num));
            break;
            case 2:
                System.out.println("Introduzca un numero para comprobar si es Primo: ");
                int num2 = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.esPrimo(num2));
            break;
            case 3:
                System.out.println("Introduzca un numero para ver cual es el siguiente Primo: ");
                int num3 = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.siguientePrimo(num3));
            break;
            case 4:
                System.out.println("Introduzca una base y un exponente para ver la potencia: ");
                int base = Integer.parseInt(System.console().readLine());
                int exponente = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.potencia(base, exponente));
            break;
            case 5:
                System.out.println("Introduzca un numero para ver cuantos digitos tiene: ");
                int num5 = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.digitos(num5));
            break;
            case 6:
                System.out.println("Introduzca un numero para ponerlo al reves: ");
                int num6 = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.voltea(num6));
            break;
            case 7:
                System.out.println("Introduzca un numero y una posicion y te devolvera el digito de esa posicion: ");
                int num7 = Integer.parseInt(System.console().readLine());
                int posi = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.digitoN(num7, posi));
            break;
            case 8:
                System.out.println("Introduzca un numero y un digito y te devolvera la posicion el la que se encuentra, si no esta devuelve -1: ");
                int num8 = Integer.parseInt(System.console().readLine());
                int ocu = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.posiciondeDigito(num8, ocu));
            break;
            case 9:
                System.out.println("Introduzca un numero y cuantos digitos quieres quitarle por la izquierda: ");
                int num9 = Integer.parseInt(System.console().readLine());
                int quita = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.quitaPorDelante(num9, quita));
            break;
            case 10:
                System.out.println("Introduzca un numero y cuantos digitos quieres quitarle por la derecha: ");
                int num10 = Integer.parseInt(System.console().readLine());
                int quita2 = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.quitaPorDetras(num10, quita2));
            break;
            case 11:
                System.out.println("Introduzca un numero y el digito que quieres pegarle por la derecha: ");
                int num11 = Integer.parseInt(System.console().readLine());
                int pega = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.pegaPorDetras(num11, pega));
            break;
            case 12:
                System.out.println("Introduzca un numero y el digito que quieres pegarle por la izquierda: ");
                int num12 = Integer.parseInt(System.console().readLine());
                int pega2 = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.pegaPorDelante(num12, pega2));
            break;
            case 13:
                System.out.println("Introduzca un numero y te juntara el primer y ultimo dígito: ");
                int num13 = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.trozoDeNumero(num13));
            break;
            case 14:
                System.out.println("Introduzca 2 numeros y te los juntara: ");
                int num14 = Integer.parseInt(System.console().readLine());
                int pega3 = Integer.parseInt(System.console().readLine());
                System.out.println(Ejercicio1_14.juntaNumeros(num14, pega3));
            break;
            default:
        }

        System.out.println("¿Desea Salir del Menu? (si/no)");
        salir = System.console().readLine();

        } while (salir.equalsIgnoreCase("no"));
    }
    
}
