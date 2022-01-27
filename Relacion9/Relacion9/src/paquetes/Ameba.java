package paquetes;

public class Ameba {
  
  int peso = 3;

  public void come (int comida){
    this.peso += (comida - 1);
  }

  public void come (Ameba ameba2){
    this.peso += (ameba2.peso - 1);
    ameba2.peso = 0;
  }

  public String toString() {
    String resultado = "";

    resultado += "Soy una ameba y peso " + this.peso + " microgramos";

    return resultado;
  }
}
