public class Ejercicio6 {
  public static void main (String[] Args){
    float altura;
    float base;
    float area;
    
    System.out.println ("Dime la altura de tu triángulo: ");
    altura = Float.parseFloat(System.console().readLine());
    
    System.out.println ("Dime la base de tu triángulo: ");
    base = Float.parseFloat(System.console().readLine());

    area = altura * base;
    area = area / 2;
    
    System.out.printf ("El area de tu triangulo es: %.2f" , area);
  }
}
