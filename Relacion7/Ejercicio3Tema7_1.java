public class Ejercicio3Tema7_1 {
  public static void main(String[] args) {
    
    int [] num = new int [10];

    for (int i = 0 ; i < 10 ; i++){
      System.out.print("Introduzca un número: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    System.out.println("Los números desde el último al primero son: ");
    for (int i = 9 ; i >= 0 ; i--){
      System.out.println(num[i]);
    }
  }
}
