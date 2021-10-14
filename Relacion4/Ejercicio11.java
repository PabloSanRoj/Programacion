public class Ejercicio11 {
  public static void main (String[] Args){
        
        int horaNoMin;
        int horaMin;
        int segEnTuHora;
        int segHastaMedia;
        
        System.out.println ("Dime una hora del dia: ");
        horaNoMin = Integer.parseInt(System.console().readLine());
        
        System.out.println ("Dime los minutos de la hora correspondiente: ");
        horaMin = Integer.parseInt(System.console().readLine());
        
        if (horaNoMin < 0 || horaNoMin > 23) {
          System.out.println ("Eso no es una hora válida, debes introducir un valor entre 0 y 23");
        
        } else if (horaMin < 0 || horaMin > 59) {
          System.out.println ("Eso no son minutos válidos, debes introducir un valor entre 0 y 59");
        
        } else {
            segEnTuHora = horaNoMin * 3600 + horaMin * 60;
            segHastaMedia = 24 * 3600 - segEnTuHora;
        
                System.out.println ("Quedan: " + segHastaMedia + " Segundos Hasta MediaNoche");
        }  
  }
}
