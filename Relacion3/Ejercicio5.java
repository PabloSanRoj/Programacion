public class Ejercicio5 {
  public static void main (String[] Args){
    float altura;
    float base;
    float area;
    
    System.out.println ("Dime la altura de tu rectángulo: ");
    altura = Float.parseFloat(System.console().readLine());
    
    System.out.println ("Dime la base de tu rectángulo: ");
    base = Float.parseFloat(System.console().readLine());

    area = altura * base;
    
    System.out.printf ("El area de tu rectangulo es: %.2f" , area);
  }
}
