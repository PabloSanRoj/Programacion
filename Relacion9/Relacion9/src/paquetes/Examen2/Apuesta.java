package paquetes.Examen2;

public class Apuesta {
  
  private int [] numeros;

  public Apuesta (int n0, int n1, int n2, int n3, int n4, int n5){
    numeros = new int [6];
    numeros[0] = n0;
    numeros[1] = n1;
    numeros[2] = n2;
    numeros[3] = n3;
    numeros[4] = n4;
    numeros[5] = n5;
  }
  public Apuesta (){
    numeros = new int [6];
    numeros[0] = (int)((Math.random()*49)+1);
    numeros[1] = (int)((Math.random()*49)+1);
    numeros[2] = (int)((Math.random()*49)+1);
    numeros[3] = (int)((Math.random()*49)+1);
    numeros[4] = (int)((Math.random()*49)+1);
    numeros[5] = (int)((Math.random()*49)+1);
  }

  public String toString() {
    String resultado = "";

    for (int i = 0; i < 6 ; i++){
      resultado += numeros[i] + " ";
    }
    
    return resultado;
  }

}
