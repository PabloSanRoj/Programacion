package paquetes;

public class Rectangulo {
  int altura;
  int base;

  public static int numRectangulos = 0;

  public static int rectangulosCreados (){
    return numRectangulos;
  }

  public Rectangulo (int b, int a){
    this.altura = a;
    this.base = b;
    numRectangulos++;
  }

  public String toString() {

    String resultado = "";

      for (int i = 1; i <= this.altura; i++) {

        for (int x = 1; x <= this.base; x++) {

            resultado += "*";

        }
        resultado += "\n";
      }

    return resultado;
  }
}
