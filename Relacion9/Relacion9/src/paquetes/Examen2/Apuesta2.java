package paquetes.Examen2;

public class Apuesta2 {
  private int [] numeros;

  int auxiliar;

  public Apuesta2 (int n0, int n1, int n2, int n3, int n4, int n5){
    numeros = new int [6];
    numeros[0] = n0;
    numeros[1] = n1;
    numeros[2] = n2;
    numeros[3] = n3;
    numeros[4] = n4;
    numeros[5] = n5;
  }

  private int apuestaValida (){

    this.auxiliar = 6;

    for (int i = 0; i < 6 ; i++){
      for (int j = 0 ; j < 6 ; j++){
        if (j != 0 && numeros[j] == numeros[i] && j != i){
          this.auxiliar = 0;
        }

        if (numeros[j] > 49 || numeros[j] < 1){
          this.auxiliar = 0;
        }
      }
    }

    return auxiliar;
  }

  public String toString() {
    String resultado = "";

    this.apuestaValida();

    if (this.auxiliar == 0){
      resultado += "Error: Apuesta no válida.";
    } else {
      for (int i = 0; i < 6 ; i++){
        resultado += numeros[i] + " ";
      }
    }
    
    return resultado;
  }
}
