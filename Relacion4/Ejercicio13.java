public class Ejercicio13 {
  public static void main (String[] Args){
        
        float numOrd1;
        float numOrd2;
        float numOrd3;
        
        System.out.println ("Dime el numero 1: ");
        numOrd1 = Float.parseFloat(System.console().readLine());
        
        System.out.println ("Dime el numero 2: ");
        numOrd2 = Float.parseFloat(System.console().readLine());
        
        System.out.println ("Dime el numero 3: ");
        numOrd3 = Float.parseFloat(System.console().readLine());

        if ((numOrd1 > numOrd2) && (numOrd1 > numOrd3) && (numOrd2 > numOrd3)) {
            System.out.println ("El orden es: " + numOrd1 + " " + numOrd2 + " " + numOrd3);
        
        } else if ((numOrd1 > numOrd2) && (numOrd1 > numOrd3) && (numOrd3 > numOrd2)) {
            System.out.println ("El orden es: " + numOrd1 + " " + numOrd3 + " " + numOrd2);
        
        } else if ((numOrd2 > numOrd1) && (numOrd2 > numOrd3) && (numOrd1 > numOrd3)) {
            System.out.println ("El orden es: " + numOrd2 + " " + numOrd1 + " " + numOrd3);
        
        } else if ((numOrd2 > numOrd3) && (numOrd2 > numOrd1) && (numOrd3 > numOrd1)) {
            System.out.println ("El orden es: " + numOrd2 + " " + numOrd3 + " " + numOrd1);
        
        } else if ((numOrd3 > numOrd1) && (numOrd3 > numOrd2) && (numOrd1 > numOrd2)) {
            System.out.println ("El orden es: " + numOrd3 + " " + numOrd1 + " " + numOrd2);
        
        } else if ((numOrd3 > numOrd2) && (numOrd3 > numOrd1) && (numOrd2 > numOrd1)) {
            System.out.println ("El orden es: " + numOrd3 + " " + numOrd2 + " " + numOrd1);
        
        } else {
            System.out.println ("No has introducido un numero valido");
        }
  }
}
