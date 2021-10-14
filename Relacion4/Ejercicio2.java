public class Ejercicio2 {
  public static void main (String[] Args){
        
        int horaDia;
        
        System.out.println ("Dime una hora del dia: ");
        horaDia = Integer.parseInt(System.console().readLine());
        
        if ((horaDia >= 6) && (horaDia <= 12)) {
            System.out.println ("Buenos dias");
        
        } else if ((horaDia >= 13) && (horaDia <=20)) {
            System.out.println ("Buenas tardes");
        
        } else if ((horaDia >= 21) && (horaDia <= 24) || (horaDia >= 1) && (horaDia <= 5)) {
            System.out.println ("Buenas noches");
        
        } else {
            System.out.println ("Eso que has introducido no es una hora del dia");
        }  
  }
}
