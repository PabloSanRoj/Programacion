package paquetes.Examen2;

public class Complejo {
  private float num1;
  private float num2;

  public Complejo (float n1, float n2){
    this.num1 = n1;
    this.num2 = n2;
  }

  public String toString() {
    String resultado = "";

    if (this.num2 >= 0){
      resultado += this.num1 + " + " + this.num2 + "i";
    } else {
      float aux = this.num2-(this.num2*2);
      resultado += this.num1 + " - " + aux + "i";
    }
    return resultado;
  }
}
