package paquetes;

public class PiramideHueca {
  int altura;
  String caracter = "*";
  String nombre;
  String orientacion;
  String caracterrelleno = " ";

  public PiramideHueca(String c, int a, String n, String o, String cr) {
    this.altura = a;
    this.caracter = c;
    this.caracterrelleno = cr;
    this.nombre = n;
    this.orientacion = o;
  }

  public String Caracter() {
    return this.caracter;
  }

  public int Altura() {
    return this.altura;
  }

  public String toString() {

    String resultado = "";
    if (this.orientacion.equals("arriba")) {

      resultado += "Nombre: " + this.nombre + "\n";
      for (int i = 1; i <= this.altura; i++) {
        for (int esp = 1; esp <= altura - i; esp++) {
          resultado += " ";
        }
        for (int x = 1; x <= (i * 2) - 1; x++) {
          if (x == 1 || x == (i * 2) - 1 || i == this.altura) {
            resultado += this.caracter;
          } else {
            resultado += " ";
          }
        }
        resultado += "\n";
      }

      return resultado;
    } else if (this.orientacion.equals("abajo")) {

      resultado += "Nombre: " + this.nombre + "\n";

      for (int i = this.altura; i >= 1; i--) {
        for (int esp = altura - 1; esp >= 1; esp--) {
          resultado += " ";
        }
        for (int x = 1; x <= (i * 2) - 1; x++) {
          if (x == 1 || x == (i * 2) - 1 || i == this.altura) {
            resultado += this.caracter;
          } else {
            resultado += this.caracterrelleno;
          }
        }
        resultado += "\n";
      }

      return resultado;

    } else if (this.orientacion.equals("izquierda")) {
      resultado += "Nombre: " + this.nombre + "\n";

      for (int i = 1; i <= this.altura; i++) {
        for (int esp = 1; esp < this.altura; esp++) {
          resultado += " ";
        }
        for (int x = 1; x <= (i * 2) - 1; x++) {
          if (x == 1 || x == (i * 2) - 1 || i == this.altura) {
            resultado += this.caracter;
          } else {
            resultado += this.caracterrelleno;
          }
        }
        resultado += "\n";
      }

      return resultado;
    } else {
      return resultado;
    }

  }
}
