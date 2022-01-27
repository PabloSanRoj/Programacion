package paquetes;

public class Movil extends Terminal {

  String tarifa;
  float dinero = 0;

  public Movil(String n, String ta) {
    super(n);
    this.tarifa = ta;
  }

  @Override
  public void llama(Terminal t, int tiempo) {
    
    super.llama(t, tiempo);

    switch (tarifa) {
      case "rata":
        this.dinero += 0.06f * tiempo / 60;
        break;
      case "mono":
        this.dinero += 0.12f * tiempo / 60;
        break;
      case "bisonte":
        this.dinero += 0.30f * tiempo / 60;
        break;
      default:
        this.dinero += 0;
    }
  }

  @Override
  public String toString(){
    String resultado = super.toString();

    resultado += " - tarificados " + String.format("%.2f", this.dinero) + " euros";

    return resultado;
  }
}
