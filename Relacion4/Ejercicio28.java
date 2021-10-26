public class Ejercicio28 {
    public static void main(String[] args) {

        String jugaPri;
        String jugaSecu;
        String resul = "nada";
        
        System.out.println ("Este programa hace un piedra, papel o tijera");
        System.out.println ("");
        System.out.println ("Turno del jugador 1 (Introduzca piedra, papel o tijera:");
        jugaPri = System.console().readLine();
        System.out.println ("Turno del jugador 2 (Introduzca piedra, papel o tijera:");
        jugaSecu = System.console().readLine();

        if (jugaPri == jugaSecu) {
            resul = "empate";
        } else if (jugaPri != jugaSecu) {
            if ((jugaPri.equalsIgnoreCase("piedra")) && (jugaSecu.equalsIgnoreCase("papel"))) {
                resul = "Gana jugador 2";
            } else if ((jugaPri.equalsIgnoreCase("piedra")) && (jugaSecu.equalsIgnoreCase("tijera"))) {
                resul = "Gana jugador 1";
            } else if ((jugaPri.equalsIgnoreCase("papel")) && (jugaSecu.equalsIgnoreCase("piedra"))) {
                resul = "Gana jugador 1";
            } else if ((jugaPri.equalsIgnoreCase("papel")) && (jugaSecu.equalsIgnoreCase("tijera"))) {
                resul = "Gana jugador 2";
            } else if ((jugaPri.equalsIgnoreCase("tijera")) && (jugaSecu.equalsIgnoreCase("papel"))) {
                resul = "Gana jugador 1";
            } else if ((jugaPri.equalsIgnoreCase("tijera")) && (jugaSecu.equalsIgnoreCase("piedra"))) {
                resul = "Gana jugador 2";
            }
        } else {
            System.out.println ("Has metido algo mal");
        }

        System.out.println ("" + resul);
    }
}
