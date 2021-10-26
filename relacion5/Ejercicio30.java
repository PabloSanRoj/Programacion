public class Ejercicio30 {
    public static void main(String[] args) {
        
        String dia;
        String dia2;
        int hora;
        int hora2;
        int horario = 0;
        int horario2 = 0;
        int total = 0;

        System.out.println("Este programa muestra la diferencia horaria");
        System.out.println("Introduzca un dia de la semana: ");
        dia = System.console().readLine();
        System.out.println("Introduzca hora del primer dia: ");
        hora = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca un dia de la semana: ");
        dia2 = System.console().readLine();
        System.out.println("Introduzca hora del segundo dia: ");
        hora2 = Integer.parseInt(System.console().readLine());

        if (dia.equalsIgnoreCase("lunes")) {
            horario = 0;
        } else if (dia.equalsIgnoreCase("martes")) {
            horario = 24;
        } else if (dia.equalsIgnoreCase("miercoles")) {
            horario = 48;
        } else if (dia.equalsIgnoreCase("jueves")) {
            horario = 72;
        } else if (dia.equalsIgnoreCase("viernes")) {
            horario = 96;
        } else if (dia.equalsIgnoreCase("sabado")) {
            horario = 120;
        } else if (dia.equalsIgnoreCase("domingo")) {
            horario = 144;
        }
        if (dia2.equalsIgnoreCase("lunes")) {
            horario2 = 0;
        } else if (dia2.equalsIgnoreCase("martes")) {
            horario2 = 24;
        } else if (dia2.equalsIgnoreCase("miercoles")) {
            horario2 = 48;
        } else if (dia2.equalsIgnoreCase("jueves")) {
            horario2 = 72;
        } else if (dia2.equalsIgnoreCase("viernes")) {
            horario2 = 96;
        } else if (dia2.equalsIgnoreCase("sabado")) {
            horario2 = 120;
        } else if (dia2.equalsIgnoreCase("domingo")) {
            horario2 = 144;
        }
        horario = horario + hora;
        horario2 = horario2 + hora2;

        do {
            total = horario2 - horario;
            horario = 2;
            horario2 = 1;
        } while (horario2 > horario) ;
        System.out.println("Entre las " + hora + ":00h del " + dia + " y las " + hora2 + ":00h del " + dia2 + " hay " + total + " hora/s");
    }
}
