import paquetes.Incidencias;

public class Ejercicio18 {
  public static void main(String[] args) {

    Incidencias inc1 = new Incidencias(105, "No tiene acceso a internet");
    Incidencias inc2 = new Incidencias(14, "No arranca");
    Incidencias inc3 = new Incidencias(5, "La pantalla se ve rosa");
    Incidencias inc4 = new Incidencias(237, "Hace un ruido extraño");
    Incidencias inc5 = new Incidencias(111, "Se cuelga al abrir 3 ventanas");
    inc2.resuelve("El equipo no estaba enchufado");
    inc3.resuelve("Cambio del cable VGA");
    System.out.println(inc1);
    System.out.println(inc2);
    System.out.println(inc3);
    System.out.println(inc4);
    System.out.println(inc5);
    System.out.println("Incidencias pendientes: " + Incidencias.getPendientes());
  }
}