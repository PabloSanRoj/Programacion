import paquetes.Poblacion;
import paquetes.Persona;

public class EjercicioExtra {
  public static void main(String[] args) {

    Poblacion p1 = new Poblacion("Malaga");
    Poblacion p2 = new Poblacion("Cordoba");
    p1.AnadirHabitante(new Persona ("dni1", "pablo"));
    p1.AnadirHabitante(new Persona ("dni2", "Ale"));
    System.out.println(p1);
    p2.Emigrar("dni2", p1);
    System.out.println(p1);
    System.out.println(p2);
  }
}
