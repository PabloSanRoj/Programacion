/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.*/

public class Ejercicio5Tema6 {
  public static void main(String[] args) {
    
    int num = 0, maxi = 100, mini = 199;
    double media = 0;

    for (int i = 0 ; i < 50 ; i++) {
      num = ((int)(Math.random()*100) + 100);
      System.out.print(num + " ");
      media = media + num;
      if (num > maxi){
        maxi = num;
      }
      if (num < mini){
        mini = num;
      }

    }
    media = media / 50;
    System.out.println();
    System.out.println("El número máximo es: " + maxi);
    System.out.println("El número mínimo es: " + mini);
    System.out.printf("La media de los números es: %.1f" , media);
  }
}
