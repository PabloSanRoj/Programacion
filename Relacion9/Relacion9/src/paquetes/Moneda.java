package paquetes;

public class Moneda {
  private String valor;
  private String valorTrucado;

  public Moneda (String trucado){
    this.valorTrucado = trucado;
    this.tirar();
  }

  public void tirar (){
    int num = (int)(Math.random() * 4);

    if (num == 0){
      if (this.valorTrucado.equals("C")){
        this.valor = "X";
      } else {
        this.valor = "C";
      }
    } else {
      this.valor = this.valorTrucado;
    }
  }

  public String getMoneda(){
    return this.valor;
  }

  public String toString() {
    String resultado = "";

      resultado += "[" + this.valor + "]";

    return resultado;
  }
}
