public class Ejercicio12 {
  public static void main (String[] Args){
    
    float notaExamen1;
    float notaIdeal;
    float notaAsacar;
    
    System.out.print ("Dime la nota que tienes en el primer examen: ");
    notaExamen1 = Float.parseFloat(System.console().readLine());
    
    System.out.print ("Dime la nota que quieres sacar en el trimestre: ");
    notaIdeal = Float.parseFloat(System.console().readLine());
    
    notaAsacar = notaIdeal * 100 - notaExamen1 * 40;
    notaAsacar = notaAsacar / 60;
    
    System.out.printf ("La nota que debes sacar en el segundo examen es: %.2f" , notaAsacar);

  }
}
