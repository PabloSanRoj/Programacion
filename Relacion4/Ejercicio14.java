public class Ejercicio14 {
  public static void main (String[] Args){
        
        int numDivi;
        
        System.out.println ("Dime un numero: ");
        numDivi = Integer.parseInt(System.console().readLine());
        
        if ((numDivi % 2 == 0) && (numDivi % 5 == 0)) {
            System.out.println ("El numero es par divisible entre 5");
        } else if (numDivi % 5 == 0) {
            System.out.println ("El numero es divisible entre 5");
        } else if (numDivi % 2 == 0) {
            System.out.println ("El numero introducido es par");
        } else {
            System.out.println ("No has introducido un numero o es impar no divisible entre 5");
        }
  }
}
