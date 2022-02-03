package paquetes.Examen2;

public class Complejo2 {
  private float num1;
  private float num2;

  public Complejo2 (float n1, float n2){
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

  public Complejo2 adicion (Complejo2 c){
    float aux1;
    float aux2;
    Complejo2 ComplejoAux;

    aux1 = this.num1 + c.num1;
    aux2 = this.num2 + c.num2;
    ComplejoAux = new Complejo2(aux1, aux2);

    return ComplejoAux;
  }

  public Complejo2 multiplicacion (Complejo2 c){
    float aux1;
    float aux2;
    Complejo2 ComplejoAux;

    aux1 = (this.num1 * c.num1) - (this.num2 * c.num2);
    aux2 = (this.num1 * c.num2) + (this.num2 * c.num1);
    ComplejoAux = new Complejo2(aux1, aux2);

    return ComplejoAux;
  }

  public Complejo2 multiplicacion (Float n){
    float aux1;
    float aux2;
    Complejo2 ComplejoAux;

    aux1 = this.num1 * n;
    aux2 = this.num2 * n;
    ComplejoAux = new Complejo2(aux1, aux2);

    return ComplejoAux;
  }
}
