package paquetes.Examen1;

public class Baraja {
  
  private Carta[] barajas;
  private int cartasActuales;

  public Baraja () {
    barajas = new Carta[52];
    this.cartasActuales = 0;
    cartasActuales++;
  }


  public Carta dameCarta () {

    Carta cartaAux;

    cartaAux = barajas[barajas.length];
    barajas = new Carta [cartasActuales];
    cartasActuales--;

    return cartaAux;
          
  }

  public int tamanio () {
    return cartasActuales;
  }

  public Carta miraCarta (int j){
    return barajas[j];
  }

  public String toString() {
    String resultado = "";

    for (int i = 0 ; i < cartasActuales; i++){
      if (i % 13 == 0){
        resultado += barajas[i].toString() + "\n";
      } else {
        resultado += barajas[i].toString();
      } 
    }

    return resultado;
  }

}
