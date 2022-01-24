package paquetes;


public class Fraccion {
  
  int numerador;
  int denominador;

  public Fraccion (int n, int d){
    this.numerador = n;
    this.denominador = d;
  }

  public String toString(){
    String muestraFraccion = "";

    muestraFraccion += numerador + "\n";
    muestraFraccion += "---\n";
    muestraFraccion += denominador;

    return muestraFraccion;
  }

  public String Invierte (){
    String invierteFraccion = "";

    invierteFraccion += denominador + "\n";
    invierteFraccion += "---\n";
    invierteFraccion += numerador;

    return invierteFraccion;
  }

  public int multiplica () {
    int multiplicaFraccion = 0;

    multiplicaFraccion = numerador * denominador;

    return multiplicaFraccion;
  }

  public float divide () {
    float divideFraccion = 0;

    divideFraccion = denominador / numerador;

    return divideFraccion;
  }

  public String simplifica () {
    String resultado = "";
    int aux;
    boolean salir = false;

    do {

    aux = numerador;

    for (int i = 2 ; i < aux ; i++){
      if (numerador % i == 0 && denominador % i == 0){
        numerador = numerador / i;
        denominador = denominador / i;
        i = aux;
      }
    }

    if (numerador == aux){
      salir = true;
    }
    } while (salir == false);

    resultado += numerador + "\n";
    resultado += "---\n";
    resultado += denominador + "\n"; 

    return resultado;
  }

}
