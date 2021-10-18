public class Ejercicio6 {
  public static void main (String[] Args){
    
    int base;
    double precioIva;
    double precioTotal;
    
    base = 100;
    
    precioIva = base * 0.21;
    precioTotal = base + precioIva;
    
    System.out.println ("Tu factura total es: " + precioTotal);
  }
}
