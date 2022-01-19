package paquetes;

public class PiramideHueca {
  int altura;
  String caracter;

  public PiramideHueca (String c, int a) {
    this.altura = a;
    this.caracter = c;
  }
   
  public String Caracter() {
    return this.caracter;
  }

  public int Altura(){
    return this.altura;
  }

  public String toString(){
    String resultado = "";

    for (int i = 1 ; i <= this.altura; i++){
      for (int esp = 1; esp <= altura-i; esp++){
        resultado += " ";
      }
      for (int x = 1; x <= (i*2) - 1; x++){
        if (x == 1 || x == (i*2) -1 || i == this.altura){
          resultado += this.caracter;
        } else {
          resultado += " ";
        }
      }
      resultado += "\n";
    }

    return resultado;
  }
}
