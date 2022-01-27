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

  public void Invierte (){

    int aux = this.numerador;
    this.numerador = this.denominador;
    this.denominador = aux;

  }

  public void multiplica (Fraccion fraccion2) {
    int numeradorFraccion = fraccion2.numerador;
    int denominadorFraccion = fraccion2.denominador;

    this.numerador *= numeradorFraccion;
    this.denominador *= denominadorFraccion;

  }

  public void divide (Fraccion fraccion2) {
    int numeradorFraccion = fraccion2.numerador;
    int denominadorFraccion = fraccion2.denominador;

    this.numerador /= denominadorFraccion;
    this.denominador /= numeradorFraccion;

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
