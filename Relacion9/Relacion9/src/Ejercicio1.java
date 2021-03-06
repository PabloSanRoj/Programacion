import paquetes.Caballo;

public class Ejercicio1 {
  public static void main(String[] args) {

    System.out.print("Introduzca el sexo del primer caballo (Macho/Hembra): ");
    String sexo = System.console().readLine();

    System.out.print("Introduzca el color del primer caballo: ");
    String color = System.console().readLine();

    System.out.print("Introduzca el numero de manchas del primer caballo: ");
    int manchas = Integer.parseInt(System.console().readLine());

    System.out.println();

    System.out.print("Introduzca el sexo del segundo caballo (Macho/Hembra): ");
    String sexo2 = System.console().readLine();

    System.out.print("Introduzca el color del segundo caballo: ");
    String color2 = System.console().readLine();

    System.out.print("Introduzca el numero de manchas del segundo caballo: ");
    int manchas2 = Integer.parseInt(System.console().readLine());

    System.out.println();

    System.out.print("Introduzca el sexo del tercer caballo (Macho/Hembra): ");
    String sexo3 = System.console().readLine();

    System.out.print("Introduzca el color del tercer caballo: ");
    String color3 = System.console().readLine();

    System.out.print("Introduzca el numero de manchas del tercer caballo: ");
    int manchas3 = Integer.parseInt(System.console().readLine());

    Caballo primerCaballo;
    Caballo segundoCaballo;
    Caballo tercerCaballo;

    primerCaballo = new Caballo(sexo, color, manchas);
    segundoCaballo = new Caballo(sexo2, color2, manchas2);
    tercerCaballo = new Caballo(sexo3, color3, manchas3);

    primerCaballo.Corre(15);
    segundoCaballo.Corre(8);
    tercerCaballo.Corre(10);

    System.out.println();
    System.out.println("Primer Caballo: ");
    System.out.print(primerCaballo.toString());
    System.out.println();
    System.out.println("Segundo Caballo: ");
    System.out.print(segundoCaballo.toString());
    System.out.println();
    System.out.println("Tercer Caballo: ");
    System.out.print(tercerCaballo.toString());
    System.out.println();

    System.out.println("El primer caballo ha recorrido: " + primerCaballo.getcarrera() + "Km");
    System.out.println("El segundo caballo ha recorrido: " + segundoCaballo.getcarrera() + "Km");
    System.out.println("El tercer caballo ha recorrido: " + tercerCaballo.getcarrera() + "Km");
    System.out.println("En la carrera se han recorrido: " + Caballo.numeroKilometros() + "km");
  }
}
