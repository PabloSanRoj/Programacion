package paquetes;

public class Piramide {
  
  int altura;

  public static int numPiramides = 0;

  public static int piramidesCreadas (){
    return numPiramides;
  }

  public Piramide (int a){
    this.altura = a;
    numPiramides++;
  }

  public String toString() {

    String resultado = "";

      for (int i = 1; i <= this.altura; i++) {
        for (int esp = 1; esp <= altura - i; esp++) {
          resultado += " ";
        }
        for (int x = 1; x <= (i * 2) - 1; x++) {

            resultado += "*";

        }
        resultado += "\n";
      }

    return resultado;
  }
}
