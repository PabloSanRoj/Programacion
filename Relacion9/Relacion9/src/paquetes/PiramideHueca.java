package paquetes;

public class PiramideHueca {
  int altura;
  String caracter;

  PiramideHueca (String c, int a) {
    this.altura = a;
    this.caracter = c;
  }

  String Caracter() {
    return this.caracter;
  }

  int Consealtura(){
    return this.altura;
  }
}
