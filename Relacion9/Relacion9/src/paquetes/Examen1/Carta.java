package paquetes.Examen1;

public class Carta {
  
  private String palo;
  private String valor;

  public Carta (String p, String v){
    this.palo = p;
    this.valor = v;
  }

  public String getValor (){
    return this.valor;
  }

  public String getPalo (){
    return this.palo;
  }

  public String toString (){
    String resultado = "";

      resultado += "[" + this.palo + "," + this.valor + "]";

    return resultado;
  }
}

