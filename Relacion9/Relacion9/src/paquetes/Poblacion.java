package paquetes;

public class Poblacion {

  private String nombrePoblacion;
  private int capacidadMaxima = 10;
  private int poblacionActual;

  private Persona[] habitantes;

  public Poblacion(String n) {
    this.nombrePoblacion = n;
    habitantes = new Persona[capacidadMaxima];
    this.poblacionActual = 0;
  }

  public boolean AnadirHabitante(Persona p) {
    if (this.poblacionActual < capacidadMaxima) {
      this.habitantes[poblacionActual] = p;
      this.poblacionActual++;
      return true;
    }

    return false;
  }

  public int Habitantes() {
    return this.poblacionActual;
  }

  public int SitiosLibres() {
    return (this.capacidadMaxima - this.poblacionActual);
  }

  public Persona BuscarPersona(String DNI) {
    for (int i = 0; i < poblacionActual; i++) {
      if (habitantes[i].getDNI().equals(DNI)) {
        return habitantes[i];
      }
    }
    return null;
  }

  public boolean Emigrar(String DNI, Poblacion P) {
    if (this.SitiosLibres() > 0) {
      Persona personaAuxiliar;
      personaAuxiliar = P.BuscarPersona(DNI);
      if (personaAuxiliar != null) {
        this.AnadirHabitante(personaAuxiliar);
        P.borrarHabitante(personaAuxiliar);
      }

    }
    return false;
  }

  public boolean borrarHabitante(Persona p) {

    boolean encontrado = false;
    int i = 0;

    for (; i < poblacionActual; i++) {
      if (this.habitantes[i] == p) {
        encontrado = true;
        break;
      }
    }

    for (; i < poblacionActual - 1; i++) {
      this.habitantes[i] = this.habitantes[i + 1];
    }

    if (encontrado == true) {
      this.poblacionActual--;
    }
    return encontrado;
  }

  public String toString() {
    String resultado = "";

      resultado += this.nombrePoblacion + "\n";

      for (int i = 0 ; i < poblacionActual; i++){
        resultado += habitantes[i].toString() + "\n";
      }

    return resultado;
  }
}
