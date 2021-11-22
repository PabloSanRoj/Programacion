public class Ejercicio9 {
  public static void main (String[] Args) {
    
    int num;
    int numDigi = 1;
    int numConver;
    
    System.out.println ("Este programa te dice cuantos digitos tiene tu numero");
    System.out.println ("Introduzca un número por favor");
    num = Integer.parseInt(System.console().readLine());
    
    numConver = num;
    
    while (numConver > 10 ) {
      numConver /= 10;
      numDigi++;
    }
    
    System.out.println ("" + num + " tiene " + numDigi + " digitos.");
  }
}
