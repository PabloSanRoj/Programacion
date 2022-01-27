package paquetes;

public class Pizza {
  
  String tamaño;
  String tipo;
  int servidas = 0;

  public static int pedidas = 0;

  public static int pizzasPedidas() {
    return pedidas;
  }

  public static int servida = 0;

  public static int pizzasServidas() {
    return servida;
  }

  public Pizza (String ti, String ta){
    this.tamaño = ta;
    this.tipo = ti;
    pedidas++;
  }

  public void servir (){
    if (this.servidas == 0){
      this.servidas++;
      servida++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }

  }

  public String toString(){
    String resultado2 = "";

    resultado2 += "pizza " + this.tipo + " " + this.tamaño + ", ";
    if (this.servidas > 0){
      resultado2 += "servida\n";
    } else {
      resultado2 += "pedida\n";
    }

    return resultado2;
  }
}
