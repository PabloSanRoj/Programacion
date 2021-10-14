public class Ejercicio7 {
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
      
      System.out.println ("tu nota media es de: " + notaMedia);
  } 
}
