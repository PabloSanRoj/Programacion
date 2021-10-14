public class Ejercicio8 {
  public static void main (String[] Args){
        
      float nota1;
      float nota2;
      float nota3;
      float notaMedia;
      
      System.out.println ("Introduzca su primera nota: ");
      nota1 = Float.parseFloat(System.console().readLine());
      
      System.out.println ("Introduzca su segunda nota: ");
      nota2 = Float.parseFloat(System.console().readLine());
      
      System.out.println ("Introduzca su tercera nota: ");
      nota3 = Float.parseFloat(System.console().readLine());
      
      notaMedia = nota1 + nota2 + nota3;
      notaMedia = notaMedia / 3;
      
      System.out.printf ("tu nota media es de: %.4s "  , notaMedia);
      
      if (notaMedia >= 0.0f && notaMedia <= 4.99f) {
      System.out.println ("Esto es un insuficiente");
      } else if (notaMedia >= 5.0f && notaMedia <=5.99f) {
      System.out.println ("Esto es un suficiente");
      } else if (notaMedia >= 6.0f && notaMedia <=6.99f) {
      System.out.println ("Esto es un bien");
      } else if (notaMedia >= 7.0f && notaMedia <= 8.99f) {
      System.out.println ("Esto es un notable");
      } else if (notaMedia >= 9.0f && notaMedia <= 10f) {
      System.out.println ("Esto es un sobresaliente");
      } else {
      System.out.println ("Has introducido un dato incorrecto");
      }
  } 
}
