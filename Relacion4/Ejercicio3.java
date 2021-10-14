public class Ejercicio3 {
  public static void main (String[] Args){
        
        int numDia;
        
        System.out.println ("Dime un numero del 1 al 7: ");
        numDia = Integer.parseInt(System.console().readLine());
        
        if (numDia == 1) {
            System.out.println ("Este numero corresponde a Lunes");
        
        } else if (numDia == 2) {
            System.out.println ("Este numero corresponde a Martes");
        
        } else if (numDia == 3) {
            System.out.println ("Este numero corresponde a Miercoles");
            
        } else if (numDia == 4) {
            System.out.println ("Este numero corresponde a Jueves");
            
        } else if (numDia == 5) {
            System.out.println ("Este numero corresponde a Viernes");   
        
        } else if (numDia == 6) {
            System.out.println ("Este numero corresponde a Sabado");
            
        } else if (numDia == 7) {
            System.out.println ("Este numero corresponde a Domingo");    
        
        } else {
            System.out.println ("Eso que has introducido no es un numero entre el 1 al 7");
        }  
  }
}
