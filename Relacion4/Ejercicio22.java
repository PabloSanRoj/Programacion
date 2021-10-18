public class Ejercicio22 {
    public static void main(String[] args) {

        String diaSem;
        int horaSem;
        int minuSem;
        int cuantosMin = 0;

        System.out.println("Este programa calcula cuanto falta para el fin de semana");
        System.out.println("Introduzca el dia de la semana: ");
        diaSem = System.console().readLine();
        System.out.println("Introduzca una hora anterior al viernes a las 15:00h: ");
        horaSem = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca los minutos de la anterior hora: ");
        minuSem = Integer.parseInt(System.console().readLine());

        switch (diaSem) {
            case "lunes" , "Lunes":
                cuantosMin = 6660 - (0 + (horaSem * 60) + minuSem);
                break;

            case "martes" , "Martes":
                cuantosMin = 6660 - (1440 + (horaSem * 60) + minuSem);
                break;

            case "miercoles" , "Miercoles":
                cuantosMin = 6660 - (2880 + (horaSem * 60) + minuSem);
                break;

            case "jueves" , "Jueves":
                cuantosMin = 6660 - (4320 + (horaSem * 60) + minuSem);
                break;

            case "viernes" , "Viernes":
                cuantosMin = 6660 - (5760 + (horaSem * 60) + minuSem);
                break;
        }
        System.out.println("Quedan : " + cuantosMin + " minutos para llegar al fin de semana");

    }
}
