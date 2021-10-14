public class Ejercicio10 {
  public static void main (String[] Args){
        
      String Mes;
      int dia;
      
      System.out.println ("Introduzca su mes de nacimiento: ");
      Mes = System.console().readLine();
      
      System.out.println ("Introduzca su dia de nacimiento: ");
      dia = Integer.parseInt(System.console().readLine());
      
      if (((Mes.equalsIgnoreCase("Marzo")) && (dia >= 21) && (dia <=31)) || ((Mes.equalsIgnoreCase("Abril")) && (dia >=1) && (dia <=20))) {
        System.out.println ("Tu Oróscopo es Aries");
      } else if (((Mes.equalsIgnoreCase("Abril")) && (dia >= 21) && (dia <=30)) || ((Mes.equalsIgnoreCase("Mayo")) && (dia >=1) && (dia <=20))) {
        System.out.println ("Tu Oróscopo es Tauro");
      } else if (((Mes.equalsIgnoreCase("Mayo")) && (dia >= 21) && (dia <=31)) || ((Mes.equalsIgnoreCase("Junio")) && (dia >=1) && (dia <=21))) {
        System.out.println ("Tu Oróscopo es Géminis");
      } else if (((Mes.equalsIgnoreCase("Junio")) && (dia >= 22) && (dia <=30)) || ((Mes.equalsIgnoreCase("Julio")) && (dia >=1) && (dia <=22))) {
        System.out.println ("Tu Oróscopo es Cancer");
      } else if (((Mes.equalsIgnoreCase("Julio")) && (dia >= 23) && (dia <=31)) || ((Mes.equalsIgnoreCase("Agosto")) && (dia >=1) && (dia <=22))) {
        System.out.println ("Tu Oróscopo es Leo");
      } else if (((Mes.equalsIgnoreCase("Agosto")) && (dia >= 23) && (dia <=31)) || ((Mes.equalsIgnoreCase("Septiembre")) && (dia >=1) && (dia <=22))) {
        System.out.println ("Tu Oróscopo es Virgo");
      } else if (((Mes.equalsIgnoreCase("Septiembre")) && (dia >= 23) && (dia <=30)) || ((Mes.equalsIgnoreCase("Octubre")) && (dia >=1) && (dia <=22))) {
        System.out.println ("Tu Oróscopo es Libra");
      } else if (((Mes.equalsIgnoreCase("Octubre")) && (dia >= 23) && (dia <=31)) || ((Mes.equalsIgnoreCase("Noviembre")) && (dia >=1) && (dia <=22))) {
        System.out.println ("Tu Oróscopo es Escorpio");
      } else if (((Mes.equalsIgnoreCase("Noviembre")) && (dia >= 23) && (dia <=30)) || ((Mes.equalsIgnoreCase("Diciembre")) && (dia >=1) && (dia <=21))) {
        System.out.println ("Tu Oróscopo es Sagitario");
      } else if (((Mes.equalsIgnoreCase("Diciembre")) && (dia >= 22) && (dia <=31)) || ((Mes.equalsIgnoreCase("Enero")) && (dia >=1) && (dia <=20))) {
        System.out.println ("Tu Oróscopo es Capricornio");
      } else if (((Mes.equalsIgnoreCase("Enero")) && (dia >= 21) && (dia <=31)) || ((Mes.equalsIgnoreCase("Febrero")) && (dia >=1) && (dia <=18))) {
        System.out.println ("Tu Oróscopo es Acuario");
      } else if (((Mes.equalsIgnoreCase("Febrero")) && (dia >= 19) && (dia <=29)) || ((Mes.equalsIgnoreCase("Marzo")) && (dia >=1) && (dia <=20))) {
        System.out.println ("Tu Oróscopo es Piscis");
      } else {
        System.out.println ("Has introducido algun dato mal");
      }
  } 
}
