public class Ejercicio4 {
  public static void main (String[] Args){
        
        int numHoras;
        int sueldo;
         
        System.out.println ("Dime el numero de horas trabajadas: ");
        numHoras = Integer.parseInt(System.console().readLine());
        
        if (numHoras <= 40) {
          sueldo = numHoras * 12;
        } else {
          sueldo = (40 * 12) + ((numHoras -40) * 16);
        }
          System.out.println ("Tu sueldo es de: " + sueldo + " Euros");
        
  }
}
