public class Ejercicio1 {
  public static void main (String[] Args){
        
        String diaSem;
        
        System.out.println ("Dime un dia de la semana: ");
        diaSem = System.console().readLine();
        
        if (diaSem.equalsIgnoreCase("Lunes")) {
          System.out.println("El Lunes a primera tienes Lenguaje de Marcas");
          
      } else if (diaSem.equalsIgnoreCase("Martes")) {
          System.out.println("El Martes a primera tienes Entornos de Desarrollo");
          
      } else if (diaSem.equalsIgnoreCase("Miercoles")) {
          System.out.println("El Miercoles a primera tienes Lenguaje de Marcas");
          
      } else if (diaSem.equalsIgnoreCase("Jueves")) {
          System.out.println("El Jueves a primera tienes Entornos de Desarrollo");
          
      } else if (diaSem.equalsIgnoreCase("Viernes")) {
          System.out.println("El Viernes a primera tienes FOL");
          
      } else if (diaSem.equalsIgnoreCase("Sabado")) {
          System.out.println("El Sabado es Fin de semana no hay clase");
          
      } else if (diaSem.equalsIgnoreCase("Domingo")) {
          System.out.println("El Domingo es Fin de semana no hay clase");
          
      } else {
          System.out.println("Eso no es un dia de la semana");
      }
  }
}
