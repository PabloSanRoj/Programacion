import paquetes.Pizza;

public class Ejercicio5 {
  public static void main(String[] args) {
    Pizza p1 = new Pizza("margarita", "mediana");
    Pizza p2 = new Pizza("funghi", "familiar");
    p2.servir();
    Pizza p3 = new Pizza("cuatro quesos", "mediana");
    System.out.print(p1);
    System.out.print(p2);
    System.out.print(p3);
    p2.servir();
    System.out.println("pedidas: " + Pizza.pizzasPedidas());
    System.out.println("servidas: " + Pizza.pizzasServidas());
    }
}
