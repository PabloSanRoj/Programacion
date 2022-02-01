package paquetes;

public class Incidencias {
  int puesto;
  String problema;
  String estado = "Pendiente";
  String solucion = "";
  int codigo;

  public static int codigoIncidencia = 1;

  public static int inciPendientes = 0;

  public static int getPendientes(){
    return inciPendientes;
  }

  public Incidencias (int pu, String pr){
    this.puesto = pu;
    this.problema = pr;
    inciPendientes++;
    this.codigo = codigoIncidencia;
    codigoIncidencia++;
  }

  public void resuelve (String r){
    this.solucion = r;
    this.estado = "Resuelta";
    inciPendientes--;
  }

  public String toString() {
    String resultado = "";

    if (this.estado.equals("Resuelta")){
      resultado += "Incidencia " + this.codigo + " - Puesto " + this.puesto + " - " + this.problema + " - " + this.estado + " - " + this.solucion;

    } else {
      resultado += "Incidencia " + this.codigo + " - Puesto " + this.puesto + " - " + this.problema + " - " + this.estado;
    }

      
      

    return resultado;
  }
}
